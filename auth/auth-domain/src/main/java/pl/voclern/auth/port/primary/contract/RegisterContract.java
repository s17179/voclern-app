package pl.voclern.auth.port.primary.contract;

import pl.voclern.shared.UseCaseContract;

public interface RegisterContract extends UseCaseContract {

    String getEmail();

    String getPassword();
}
