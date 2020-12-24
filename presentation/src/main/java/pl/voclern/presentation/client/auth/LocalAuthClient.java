package pl.voclern.presentation.client.auth;

import lombok.RequiredArgsConstructor;
import pl.voclern.auth.port.primary.AuthFacade;
import pl.voclern.presentation.client.auth.contract.RegisterContract;

@RequiredArgsConstructor
class LocalAuthClient implements AuthClient {

    private final AuthFacade authFacade;

    @Override
    public void register(RegisterContract contract) {
        authFacade.register(contract);
    }
}
