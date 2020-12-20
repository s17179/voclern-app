package pl.voclern.presentation.web.vocabulary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pl.voclern.presentation.client.vocabulary.contract.AddWordGroupContract;

@RequiredArgsConstructor
@Getter
class AddWordGroupModel implements AddWordGroupContract {

    private final String id;
    private final String name;
}
