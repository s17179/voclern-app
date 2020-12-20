package pl.voclern.vocabulary;

import lombok.RequiredArgsConstructor;
import pl.voclern.vocabulary.port.secondary.WordRepository;
import pl.voclern.vocabulary.port.secondary.dto.WordDto;

@RequiredArgsConstructor
class LoadWordUseCase {

    private final WordRepository wordRepository;

    public WordDto view(String id) {
        return wordRepository.get(id);
    }
}
