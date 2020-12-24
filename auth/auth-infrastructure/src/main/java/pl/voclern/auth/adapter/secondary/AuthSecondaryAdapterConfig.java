package pl.voclern.auth.adapter.secondary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.auth.port.secondary.PasswordEncoder;

@Configuration
class AuthSecondaryAdapterConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
