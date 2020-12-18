package pl.voclern.vocabulary.domain;

import lombok.RequiredArgsConstructor;
import pl.voclern.vocabulary.domain.port.primary.contract.AddWordContract;

@RequiredArgsConstructor
class WordFacadeImpl implements pl.voclern.vocabulary.domain.port.primary.WordFacade {

    private final AddWordUseCase addWordUseCase;

    @Override
    public void add(AddWordContract contract) {
        addWordUseCase.perform(contract);
    }
}
