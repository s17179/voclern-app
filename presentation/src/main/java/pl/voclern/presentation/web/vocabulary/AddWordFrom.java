package pl.voclern.presentation.web.vocabulary;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
class AddWordFrom {

    @NotNull
    @Size(min = 1)
    private String value;

    @NotNull
    @Size(min = 1)
    private String translation;

    private List<String> wordGroupIds = new ArrayList<>();
}
