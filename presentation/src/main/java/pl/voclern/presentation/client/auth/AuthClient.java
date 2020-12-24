package pl.voclern.presentation.client.auth;

import pl.voclern.presentation.client.auth.contract.RegisterContract;

public interface AuthClient {

    void register(RegisterContract contract);
}
