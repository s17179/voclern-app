package pl.voclern.presentation.web.auth;

import lombok.Getter;
import lombok.Setter;
import pl.voclern.auth.api.register.RegisterUseCaseContract;
import pl.voclern.validator.FieldMatch;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@FieldMatch(firstFieldName = "password", secondFieldName = "repeatedPassword", message = "Passwords do not match")
public class RegisterRequest implements RegisterUseCaseContract {

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    private String repeatedPassword;
}