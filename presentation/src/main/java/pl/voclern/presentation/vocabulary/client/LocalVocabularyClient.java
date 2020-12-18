package pl.voclern.presentation.vocabulary.client;

import lombok.RequiredArgsConstructor;
import pl.voclern.presentation.vocabulary.client.contract.AddWordContract;
import pl.voclern.vocabulary.domain.port.primary.WordFacade;

@RequiredArgsConstructor
class LocalVocabularyClient implements VocabularyClient {

    private final WordFacade wordFacade;

    @Override
    public void addWord(AddWordContract contract) {
        wordFacade.add(contract);
    }
}
