package pl.voclern.presentation.web.vocabulary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pl.voclern.presentation.vocabulary.client.contract.AddWordContract;

import java.util.UUID;

@RequiredArgsConstructor
@Getter
class AddWordModel implements AddWordContract {

    private final UUID id;
    private final String wordValue;
    private final String wordTranslation;
}
