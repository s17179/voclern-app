package pl.voclern.vocabulary.port.primary.contract;

import pl.voclern.shared.UseCaseContract;

public interface ListWordsQueryContract extends UseCaseContract {

    String getOwnerId();
}
