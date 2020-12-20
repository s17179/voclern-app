package pl.voclern.vocabulary;

import lombok.RequiredArgsConstructor;
import pl.voclern.shared.ViewUseCase;
import pl.voclern.vocabulary.port.primary.contract.ListWordsQueryContract;
import pl.voclern.vocabulary.port.secondary.WordRepository;
import pl.voclern.vocabulary.port.secondary.dto.WordDto;

import java.util.List;

@RequiredArgsConstructor
class ListWordsUseCase implements ViewUseCase<List<WordDto>, ListWordsQueryContract> {

    private final WordRepository wordRepository;

    @Override
    public List<WordDto> view(ListWordsQueryContract contract) {
        return wordRepository.findAll();
    }
}
