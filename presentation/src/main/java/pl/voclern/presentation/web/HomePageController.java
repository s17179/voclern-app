package pl.voclern.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomePageController {

    @GetMapping("/")
    public String homepage() {
        return "homepage";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
