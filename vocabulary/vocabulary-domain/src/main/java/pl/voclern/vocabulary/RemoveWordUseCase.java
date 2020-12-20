package pl.voclern.vocabulary;

import lombok.RequiredArgsConstructor;
import pl.voclern.vocabulary.port.secondary.WordRepository;

@RequiredArgsConstructor
class RemoveWordUseCase {

    private final WordRepository wordRepository;

    public void perform(String id) {
        wordRepository.remove(id);
    }
}
