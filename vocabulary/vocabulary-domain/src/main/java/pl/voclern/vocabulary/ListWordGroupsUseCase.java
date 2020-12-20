package pl.voclern.vocabulary;

import lombok.RequiredArgsConstructor;
import pl.voclern.shared.ViewUseCase;
import pl.voclern.vocabulary.port.primary.contract.ListWordGroupsContract;
import pl.voclern.vocabulary.port.secondary.WordGroupRepository;
import pl.voclern.vocabulary.port.secondary.dto.WordGroupDto;

import java.util.List;

@RequiredArgsConstructor
class ListWordGroupsUseCase implements ViewUseCase<List<WordGroupDto>, ListWordGroupsContract> {

    private final WordGroupRepository wordGroupRepository;

    @Override
    public List<WordGroupDto> view(ListWordGroupsContract contract) {
        return wordGroupRepository.findAll("");
    }
}
