package pl.voclern.presentation.web.vocabulary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pl.voclern.presentation.client.vocabulary.contract.AddWordGroupContact;

import java.util.UUID;

@RequiredArgsConstructor
@Getter
class AddWordGroupModel implements AddWordGroupContact {

    private final UUID id;
    private final String name;
}
