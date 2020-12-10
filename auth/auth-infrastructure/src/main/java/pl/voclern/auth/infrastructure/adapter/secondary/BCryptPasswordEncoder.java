package pl.voclern.auth.infrastructure.adapter.secondary;

import pl.voclern.auth.domain.port.secondary.PasswordEncoder;

public class BCryptPasswordEncoder
        extends org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
        implements PasswordEncoder {
}
