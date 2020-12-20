package pl.voclern.vocabulary.port.primary.contract;

import pl.voclern.shared.UseCaseContract;

public interface AddWordGroupContract extends UseCaseContract {

    String getId();

    String getName();
}
