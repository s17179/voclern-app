package pl.voclern.presentation.web.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import pl.voclern.presentation.client.auth.AuthClient;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class AuthController {

    private final AuthClient authClient;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("model", new RegisterModel());

        return "register";
    }

    @PostMapping("/register")
    public RedirectView registerSubmit(@Valid RegisterModel model) {
        authClient.register(model);

        return new RedirectView("/login");
    }
}
