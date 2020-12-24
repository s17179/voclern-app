package pl.voclern.auth;

import lombok.RequiredArgsConstructor;
import pl.voclern.auth.port.primary.AuthFacade;
import pl.voclern.auth.port.primary.contract.RegisterContract;

@RequiredArgsConstructor
class AuthFacadeImpl implements AuthFacade {

    private final RegisterUseCase registerUseCase;

    @Override
    public void register(RegisterContract contract) {
        registerUseCase.perform(contract);
    }
}
