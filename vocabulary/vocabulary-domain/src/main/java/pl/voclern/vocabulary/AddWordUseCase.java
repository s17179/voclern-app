package pl.voclern.vocabulary;

import lombok.RequiredArgsConstructor;
import pl.voclern.shared.UseCase;
import pl.voclern.vocabulary.port.primary.contract.AddWordContract;
import pl.voclern.vocabulary.port.secondary.WordGroupRepository;
import pl.voclern.vocabulary.port.secondary.WordRepository;
import pl.voclern.vocabulary.port.secondary.dto.WordDto;

@RequiredArgsConstructor
class AddWordUseCase implements UseCase<AddWordContract> {

    private final WordRepository wordRepository;
    private final WordGroupRepository wordGroupRepository;

    @Override
    public void perform(AddWordContract contract) {
        var wordDto = new WordDto(
                contract.getId(),
                contract.getWordValue(),
                contract.getWordTranslation()
        );

        wordRepository.create(wordDto);
    }
}
