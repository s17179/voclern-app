package pl.voclern.presentation.web.vocabulary;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
class AddWordRequest {

    @NotNull
    private String value;

    @NotNull
    private String translation;

    private List<String> wordGroupIds = new ArrayList<>();
}
