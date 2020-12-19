package pl.voclern.presentation.client.vocabulary;

import lombok.RequiredArgsConstructor;
import pl.voclern.presentation.client.vocabulary.contract.AddWordContract;
import pl.voclern.presentation.client.vocabulary.contract.AddWordGroupContact;
import pl.voclern.vocabulary.port.primary.VocabularyFacade;

@RequiredArgsConstructor
class LocalVocabularyClient implements VocabularyClient {

    private final VocabularyFacade vocabularyFacade;

    @Override
    public void addWord(AddWordContract contract) {
        vocabularyFacade.addWord(contract);
    }

    @Override
    public void addWordGroup(AddWordGroupContact contact) {
        vocabularyFacade.addWordGroup(contact);
    }
}
