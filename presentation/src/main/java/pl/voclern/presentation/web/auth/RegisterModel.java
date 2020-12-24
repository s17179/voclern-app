package pl.voclern.presentation.web.auth;

import lombok.Getter;
import lombok.Setter;
import pl.voclern.presentation.client.auth.contract.RegisterContract;
import pl.voclern.validator.FieldMatch;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@FieldMatch(firstFieldName = "password", secondFieldName = "repeatedPassword", message = "Passwords do not match")
public class RegisterModel implements RegisterContract {

    @NotNull
    @Size(min = 1)
    private String email;

    @NotNull
    @Size(min = 1)
    private String password;

    @NotNull
    private String repeatedPassword;
}