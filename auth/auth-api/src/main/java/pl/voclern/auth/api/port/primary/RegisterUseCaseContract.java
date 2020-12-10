package pl.voclern.auth.api.port.primary;

import pl.voclern.shared.UseCaseContract;

public interface RegisterUseCaseContract extends UseCaseContract {

    String getEmail();

    String getPassword();
}
