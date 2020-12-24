package pl.voclern.auth.adapter.secondary;

import pl.voclern.auth.port.secondary.PasswordEncoder;

class BCryptPasswordEncoder
        extends org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
        implements PasswordEncoder {
}
