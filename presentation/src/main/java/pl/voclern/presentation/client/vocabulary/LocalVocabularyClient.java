package pl.voclern.presentation.client.vocabulary;

import lombok.RequiredArgsConstructor;
import pl.voclern.presentation.client.vocabulary.contract.AddWordContract;
import pl.voclern.vocabulary.port.primary.WordFacade;

@RequiredArgsConstructor
class LocalVocabularyClient implements VocabularyClient {

    private final WordFacade wordFacade;

    @Override
    public void addWord(AddWordContract contract) {
        wordFacade.add(contract);
    }
}
