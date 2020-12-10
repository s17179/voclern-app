package pl.voclern.presentation.web.vocabulary;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@Secured("ROLE_USER")
public class WordController {

    @GetMapping("/new-word")
    public String newWord() {
        return "new-word";
    }
}
