package pl.voclern.auth.adapter.secondary;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pl.voclern.auth.port.primary.AuthFacade;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
class AuthRestController {

    private final HibernateUserEntityRepository userRepository;
    private final AuthFacade authFacade;

    @PostMapping("/api/login")
    public Token login(@Valid @RequestBody LoginModel model) {
        var optionalUser = userRepository.findByEmail(model.getEmail());

        if (optionalUser.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid user credentials");
        }

        var user = optionalUser.get();

        var encoder = new BCryptPasswordEncoder();
        if (!encoder.matches(model.getPassword(), user.getPassword())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid user credentials");
        }

        var token = Token.generateRandom();

        user.setToken(token.toString());

        userRepository.save(user);

        return token;
    }

    @PostMapping("/api/register")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void register(@Valid @RequestBody RegisterModel model) {
        authFacade.register(model);
    }
}
