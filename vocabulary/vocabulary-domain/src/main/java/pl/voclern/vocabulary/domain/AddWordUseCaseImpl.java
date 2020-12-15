package pl.voclern.vocabulary.domain;

import lombok.RequiredArgsConstructor;
import pl.voclern.vocabulary.api.addword.AddWordUseCase;
import pl.voclern.vocabulary.api.addword.AddWordUseCaseContract;

@RequiredArgsConstructor
public class AddWordUseCaseImpl implements AddWordUseCase {

    private final WordFactory wordFactory;

    @Override
    public void perform(AddWordUseCaseContract contract) {
    }
}
