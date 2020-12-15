package pl.voclern.presentation.web.vocabulary;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.voclern.vocabulary.api.addword.AddWordUseCase;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
//@Secured("ROLE_USER")
public class WordController {

    private final AddWordUseCase addWordUseCase;

    @GetMapping("/new-word")
    public String newWord(Model model) {
        model.addAttribute("request", new AddWordRequest());

        return "new-word";
    }

    @PostMapping("/add-word")
    public String addWord(@Valid @ModelAttribute AddWordRequest request) {
        addWordUseCase.perform(request);

        return "homepage";
    }
}
