package pl.voclern.presentation.web.vocabulary;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
class AddWordGroupForm {

    @NotNull
    @Size(min = 1)
    private String name;
}
