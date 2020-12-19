package pl.voclern.vocabulary;

import lombok.RequiredArgsConstructor;
import pl.voclern.vocabulary.port.primary.contract.AddWordContract;
import pl.voclern.vocabulary.port.primary.VocabularyFacade;
import pl.voclern.vocabulary.port.primary.contract.AddWordGroupContact;

@RequiredArgsConstructor
class VocabularyFacadeImpl implements VocabularyFacade {

    private final AddWordUseCase addWordUseCase;
    private final AddWordGroupUseCase addWordGroupUseCase;

    @Override
    public void addWord(AddWordContract contract) {
        addWordUseCase.perform(contract);
    }

    @Override
    public void addWordGroup(AddWordGroupContact contact) {
        addWordGroupUseCase.perform(contact);
    }
}
