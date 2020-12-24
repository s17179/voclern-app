package pl.voclern.presentation.client.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.auth.port.primary.AuthFacade;

@Configuration
class AuthClientConfig {

    @Bean
    public AuthClient authClient(AuthFacade authFacade) {
        return new LocalAuthClient(authFacade);
    }
}
