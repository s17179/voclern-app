package pl.voclern.vocabulary.adapter.secondary;

import lombok.Getter;
import lombok.Setter;
import pl.voclern.vocabulary.port.primary.contract.AddWordContract;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
class AddWordModel implements AddWordContract {

    @NotNull
    @Size(min = 1)
    private String id;

    @NotNull
    @Size(min = 1)
    private String wordValue;

    @NotNull
    @Size(min = 1)
    private String wordTranslation;
}
