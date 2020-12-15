package pl.voclern.auth.api.register;

import pl.voclern.shared.UseCaseContract;

public interface RegisterUseCaseContract extends UseCaseContract {

    String getEmail();

    String getPassword();
}
