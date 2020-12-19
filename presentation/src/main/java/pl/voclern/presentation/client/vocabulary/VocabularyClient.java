package pl.voclern.presentation.client.vocabulary;

import pl.voclern.presentation.client.vocabulary.contract.AddWordContract;

public interface VocabularyClient {

    void addWord(AddWordContract contract);
}
