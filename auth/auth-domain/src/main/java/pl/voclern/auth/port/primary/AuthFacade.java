package pl.voclern.auth.port.primary;

import pl.voclern.auth.port.primary.contract.RegisterContract;

public interface AuthFacade {

    void register(RegisterContract contract);
}
