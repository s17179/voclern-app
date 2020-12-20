package pl.voclern.vocabulary.port.primary.contract;

import pl.voclern.shared.UseCaseContract;

import java.util.List;

public interface AddWordContract extends UseCaseContract {

    String getId();

    String getWordValue();

    String getWordTranslation();

    List<String> getWordGroupIds();
}
