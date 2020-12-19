package pl.voclern.presentation.client.vocabulary;

import pl.voclern.presentation.client.vocabulary.contract.AddWordContract;
import pl.voclern.presentation.client.vocabulary.contract.AddWordGroupContact;

public interface VocabularyClient {

    void addWord(AddWordContract contract);

    void addWordGroup(AddWordGroupContact contact);
}
