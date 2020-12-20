package pl.voclern.presentation.client.vocabulary;

import lombok.RequiredArgsConstructor;
import pl.voclern.presentation.client.vocabulary.contract.AddWordContract;
import pl.voclern.presentation.client.vocabulary.contract.AddWordGroupContract;
import pl.voclern.presentation.client.vocabulary.contract.ListWordGroupsContract;
import pl.voclern.presentation.client.vocabulary.contract.ListWordsQueryContract;
import pl.voclern.vocabulary.port.primary.VocabularyFacade;
import pl.voclern.vocabulary.port.secondary.dto.WordDto;
import pl.voclern.vocabulary.port.secondary.dto.WordGroupDto;

import java.util.List;

@RequiredArgsConstructor
class LocalVocabularyClient implements VocabularyClient {

    private final VocabularyFacade vocabularyFacade;

    @Override
    public void addWord(AddWordContract contract) {
        vocabularyFacade.addWord(contract);
    }

    @Override
    public void addWordGroup(AddWordGroupContract contact) {
        vocabularyFacade.addWordGroup(contact);
    }

    @Override
    public List<WordGroupDto> listWordGroups(ListWordGroupsContract contract) {
        return vocabularyFacade.listWordGroups(contract);
    }

    @Override
    public List<WordDto> listWords(ListWordsQueryContract contract) {
        return vocabularyFacade.listWords(contract);
    }

    @Override
    public void removeWord(String id) {
        vocabularyFacade.removeWord(id);
    }

    @Override
    public WordDto get(String id) {
        return vocabularyFacade.get(id);
    }
}
