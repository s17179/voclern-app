package pl.voclern.presentation.web.vocabulary;

import lombok.Getter;
import lombok.Setter;
import pl.voclern.vocabulary.api.addword.AddWordUseCaseContract;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class AddWordRequest implements AddWordUseCaseContract {

    private UUID id = UUID.randomUUID();

    @NotNull
    private String value;

    @NotNull
    private String translation;

    private List<String> wordGroupIds = new ArrayList<>();
}
