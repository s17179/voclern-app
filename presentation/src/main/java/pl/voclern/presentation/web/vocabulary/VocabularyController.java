package pl.voclern.presentation.web.vocabulary;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import pl.voclern.presentation.client.vocabulary.VocabularyClient;
import pl.voclern.vocabulary.port.secondary.dto.WordDto;
import pl.voclern.vocabulary.port.secondary.dto.WordGroupDto;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
//@Secured("ROLE_USER")
class VocabularyController {

    private final VocabularyClient vocabularyClient;

    @GetMapping("/new-word")
    public String newWord(Model model) {
        var request = new ListWordGroupsRequest(UUID.randomUUID().toString());

        List<WordGroupDto> wordGroups = vocabularyClient.listWordGroups(request);

        model.addAttribute("model", new AddWordFrom());
        model.addAttribute("wordGroups", wordGroups);

        return "new-word";
    }

    @PostMapping("/add-word")
    public RedirectView addWord(@Valid AddWordFrom form) {
        var model = new AddWordModel(UUID.randomUUID().toString(), form.getValue(), form.getTranslation(), form.getWordGroupIds());

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
        var model = new AddWordGroupModel(UUID.randomUUID().toString(), form.getName());

        vocabularyClient.addWordGroup(model);

        return new RedirectView("/");
    }

    @GetMapping("/word-list")
    public String wordList(Model model) {
        List<WordDto> words = vocabularyClient.listWords(() -> UUID.randomUUID().toString());

        model.addAttribute("words", words);

        return "word-list";
    }

    @GetMapping("/word/remove/{id}")
    public RedirectView removeWord(@PathVariable("id") String id) {
        vocabularyClient.removeWord(id);

        return new RedirectView("/");
    }

    @GetMapping("/word/update/{id}")
    public String updateWord(@PathVariable("id") String id, Model model) {
        WordDto word = vocabularyClient.get(id);

        model.addAttribute("word", word);

        return "update-word";
    }

    @PostMapping("/word/update/{id}")
    public RedirectView updateWord(@PathVariable("id") String id, @Valid AddWordFrom form) {
        var model = new AddWordModel(id, form.getValue(), form.getTranslation(), form.getWordGroupIds());

        vocabularyClient.addWord(model);

        return new RedirectView("/");
    }
}
