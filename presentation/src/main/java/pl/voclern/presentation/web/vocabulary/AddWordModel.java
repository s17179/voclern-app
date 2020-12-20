package pl.voclern.presentation.web.vocabulary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pl.voclern.presentation.client.vocabulary.contract.AddWordContract;

import java.util.List;

@RequiredArgsConstructor
@Getter
class AddWordModel implements AddWordContract {

    private final String id;
    private final String wordValue;
    private final String wordTranslation;
    private final List<String> wordGroupIds;
}
