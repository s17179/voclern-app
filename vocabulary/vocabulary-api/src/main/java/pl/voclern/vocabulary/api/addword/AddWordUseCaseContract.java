package pl.voclern.vocabulary.api.addword;

import pl.voclern.shared.UseCaseContract;

import java.util.UUID;

public interface AddWordUseCaseContract extends UseCaseContract {

    UUID getId();

    String getValue();

    String getTranslation();
}
