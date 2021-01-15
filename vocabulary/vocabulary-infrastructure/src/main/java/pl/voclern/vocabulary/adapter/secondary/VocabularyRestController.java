package pl.voclern.vocabulary.adapter.secondary;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import pl.voclern.vocabulary.port.primary.VocabularyFacade;
import pl.voclern.vocabulary.port.secondary.dto.WordDto;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@Secured("ROLE_USER")
@AllArgsConstructor
class VocabularyRestController {

    private final VocabularyFacade vocabularyFacade;

    @PostMapping("/api/add-word")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addWord(@Valid @RequestBody AddWordModel model) {
        vocabularyFacade.addWord(model);
    }

    @GetMapping("/api/word-list")
    public List<WordDto> wordList() {
        return vocabularyFacade.listWords(() -> UUID.randomUUID().toString());
    }

    @PostMapping("/api/word/update")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void updateWord(@Valid @RequestBody AddWordModel model) {
        vocabularyFacade.addWord(model);
    }

    @DeleteMapping("/api/word/remove/{id}")
    public void removeWord(@PathVariable("id") String id) {
        vocabularyFacade.removeWord(id);
    }
}
