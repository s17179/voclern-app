package pl.voclern.auth.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.auth.api.register.RegisterUseCase;
import pl.voclern.auth.domain.RegisterUseCaseImpl;
import pl.voclern.auth.domain.UserFactory;
import pl.voclern.auth.domain.port.secondary.PasswordEncoder;
import pl.voclern.auth.domain.port.secondary.UserRepository;
import pl.voclern.auth.infrastructure.adapter.secondary.BCryptPasswordEncoder;

@Configuration
class AuthServiceProvider {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserFactory userFactory(PasswordEncoder passwordEncoder) {
        return new UserFactory(passwordEncoder);
    }

    @Bean
    public RegisterUseCase registerUseCase(UserFactory userFactory, UserRepository userRepository) {
        return new RegisterUseCaseImpl(userFactory, userRepository);
    }
}
