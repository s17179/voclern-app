package pl.voclern.vocabulary;

import lombok.RequiredArgsConstructor;
import pl.voclern.shared.UseCase;
import pl.voclern.vocabulary.port.primary.contract.AddWordGroupContact;
import pl.voclern.vocabulary.port.secondary.WordGroupRepository;
import pl.voclern.vocabulary.port.secondary.dto.WordGroupDto;

@RequiredArgsConstructor
class AddWordGroupUseCase implements UseCase<AddWordGroupContact> {

    private final WordGroupRepository wordGroupRepository;

    @Override
    public void perform(AddWordGroupContact contract) {
        var wordGroupDto = new WordGroupDto(contract.getId(), contract.getName());

        wordGroupRepository.create(wordGroupDto);
    }
}
