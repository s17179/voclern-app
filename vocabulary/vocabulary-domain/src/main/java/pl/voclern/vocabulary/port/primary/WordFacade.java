package pl.voclern.vocabulary.port.primary;

import pl.voclern.vocabulary.port.primary.contract.AddWordContract;

public interface WordFacade {

    void add(AddWordContract contract);
}
