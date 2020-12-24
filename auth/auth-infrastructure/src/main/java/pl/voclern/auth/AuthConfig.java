package pl.voclern.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.auth.port.primary.AuthFacade;
import pl.voclern.auth.port.secondary.PasswordEncoder;
import pl.voclern.auth.port.secondary.UserRepository;

@Configuration
class AuthConfig {

    @Bean
    public UserFactory userFactory(PasswordEncoder passwordEncoder) {
        return new UserFactory(passwordEncoder);
    }

    @Bean
    public RegisterUseCase registerUseCase(UserFactory userFactory, UserRepository userRepository) {
        return new RegisterUseCase(userFactory, userRepository);
    }

    @Bean
    public AuthFacade authFacade(RegisterUseCase registerUseCase) {
        return new AuthFacadeImpl(registerUseCase);
    }
}
