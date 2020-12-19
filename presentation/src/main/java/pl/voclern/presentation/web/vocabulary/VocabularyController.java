package pl.voclern.presentation.web.vocabulary;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import pl.voclern.presentation.client.vocabulary.VocabularyClient;

import javax.validation.Valid;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
//@Secured("ROLE_USER")
class VocabularyController {

    private final VocabularyClient vocabularyClient;

    @GetMapping("/new-word")
    public String newWord(Model model) {
        model.addAttribute("model", new AddWordFrom());

        return "new-word";
    }

    @PostMapping("/add-word")
    public RedirectView addWord(@Valid AddWordFrom form) {
        var model = new AddWordModel(UUID.randomUUID(), form.getValue(), form.getTranslation());

        vocabularyClient.addWord(model);

        return new RedirectView("/");
    }

    @GetMapping("/new-word-group")
    public String newWordGroup(Model model) {
        model.addAttribute("model", new AddWordGroupForm());

        return "new-word-group";
    }

    @PostMapping("/add-word-group")
    public RedirectView addWordGroup(@Valid AddWordGroupForm form) {
        var model = new AddWordGroupModel(UUID.randomUUID(), form.getName());

        vocabularyClient.addWordGroup(model);

        return new RedirectView("/");
    }
}
