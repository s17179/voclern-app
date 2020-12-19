package pl.voclern.vocabulary.port.primary;

import pl.voclern.vocabulary.port.primary.contract.AddWordContract;
import pl.voclern.vocabulary.port.primary.contract.AddWordGroupContact;

public interface VocabularyFacade {

    void addWord(AddWordContract contract);

    void addWordGroup(AddWordGroupContact contact);
}
