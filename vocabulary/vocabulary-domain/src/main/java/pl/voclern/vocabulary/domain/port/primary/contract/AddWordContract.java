package pl.voclern.vocabulary.domain.port.primary.contract;

import pl.voclern.shared.UseCaseContract;

import java.util.UUID;

public interface AddWordContract extends UseCaseContract {

    UUID getId();

    String getWordValue();

    String getWordTranslation();
}
