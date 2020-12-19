package pl.voclern.vocabulary;

import lombok.RequiredArgsConstructor;
import pl.voclern.vocabulary.port.primary.contract.AddWordContract;
import pl.voclern.vocabulary.port.primary.WordFacade;

@RequiredArgsConstructor
class WordFacadeImpl implements WordFacade {

    private final AddWordUseCase addWordUseCase;

    @Override
    public void add(AddWordContract contract) {
        addWordUseCase.perform(contract);
    }
}
