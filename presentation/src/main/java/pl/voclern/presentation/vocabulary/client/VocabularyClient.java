package pl.voclern.presentation.vocabulary.client;

import pl.voclern.presentation.vocabulary.client.contract.AddWordContract;

public interface VocabularyClient {

    void addWord(AddWordContract contract);
}
