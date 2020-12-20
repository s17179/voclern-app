package pl.voclern.presentation.web.vocabulary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import pl.voclern.presentation.client.vocabulary.contract.ListWordGroupsContract;

@RequiredArgsConstructor
@Getter
class ListWordGroupsRequest implements ListWordGroupsContract {

    private final String ownerId;
}
