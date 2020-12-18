package pl.voclern.presentation.web.vocabulary;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import pl.voclern.presentation.vocabulary.client.VocabularyClient;

import javax.validation.Valid;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
//@Secured("ROLE_USER")
class WordController {

    private final VocabularyClient vocabularyClient;

    @GetMapping("/new-word")
    public String newWord(Model model) {
        model.addAttribute("model", new AddWordRequest());

        return "new-word";
    }

    @PostMapping("/add-word")
    public RedirectView addWord(@Valid @ModelAttribute AddWordRequest request) {
        var model = new AddWordModel(UUID.randomUUID(), request.getValue(), request.getTranslation());

        vocabularyClient.addWord(model);

        return new RedirectView("/");
    }
}
