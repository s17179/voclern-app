package pl.voclern.vocabulary;

import lombok.RequiredArgsConstructor;
import pl.voclern.vocabulary.port.primary.contract.AddWordContract;
import pl.voclern.vocabulary.port.primary.VocabularyFacade;
import pl.voclern.vocabulary.port.primary.contract.AddWordGroupContract;
import pl.voclern.vocabulary.port.primary.contract.ListWordGroupsContract;
import pl.voclern.vocabulary.port.primary.contract.ListWordsQueryContract;
import pl.voclern.vocabulary.port.secondary.dto.WordDto;
import pl.voclern.vocabulary.port.secondary.dto.WordGroupDto;

import java.util.List;

@RequiredArgsConstructor
class VocabularyFacadeImpl implements VocabularyFacade {

    private final AddWordUseCase addWordUseCase;
    private final AddWordGroupUseCase addWordGroupUseCase;
    private final ListWordGroupsUseCase listWordGroupsUseCase;
    private final ListWordsUseCase listWordsUseCase;
    private final RemoveWordUseCase removeWordUseCase;
    private final LoadWordUseCase loadWordUseCase;

    @Override
    public void addWord(AddWordContract contract) {
        addWordUseCase.perform(contract);
    }

    @Override
    public void addWordGroup(AddWordGroupContract contact) {
        addWordGroupUseCase.perform(contact);
    }

    @Override
    public List<WordGroupDto> listWordGroups(ListWordGroupsContract contract) {
        return listWordGroupsUseCase.view(contract);
    }

    @Override
    public List<WordDto> listWords(ListWordsQueryContract contract) {
        return listWordsUseCase.view(contract);
    }

    @Override
    public void removeWord(String id) {
        removeWordUseCase.perform(id);
    }

    @Override
    public WordDto get(String id) {
        return loadWordUseCase.view(id);
    }
}
