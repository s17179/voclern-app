package pl.voclern.vocabulary.domain;

import lombok.RequiredArgsConstructor;
import pl.voclern.shared.UseCase;
import pl.voclern.vocabulary.domain.port.primary.contract.AddWordContract;
import pl.voclern.vocabulary.domain.port.secondary.WordRepository;
import pl.voclern.vocabulary.domain.port.secondary.dto.WordDto;

@RequiredArgsConstructor
class AddWordUseCase implements UseCase<AddWordContract> {

    private final WordRepository wordRepository;

    @Override
    public void perform(AddWordContract contract) {
        var wordDto = new WordDto(contract.getId(), contract.getWordValue(), contract.getWordTranslation());

        wordRepository.create(wordDto);
    }
}
