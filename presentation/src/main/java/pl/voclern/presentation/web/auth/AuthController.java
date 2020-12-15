package pl.voclern.presentation.web.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import pl.voclern.auth.api.register.RegisterUseCase;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final RegisterUseCase registerUseCase;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("request", new RegisterRequest());

        return "register";
    }

    @PostMapping("/register")
    public RedirectView registerSubmit(@Valid @ModelAttribute RegisterRequest request) {
        registerUseCase.perform(request);

        return new RedirectView("/login");
    }
}
