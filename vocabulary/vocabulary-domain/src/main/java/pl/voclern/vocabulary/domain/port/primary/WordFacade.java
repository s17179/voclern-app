package pl.voclern.vocabulary.domain.port.primary;

import pl.voclern.vocabulary.domain.port.primary.contract.AddWordContract;

public interface WordFacade {

    void add(AddWordContract contract);
}
