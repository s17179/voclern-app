package pl.voclern.auth.domain;

import lombok.RequiredArgsConstructor;
import pl.voclern.auth.domain.port.secondary.PasswordEncoder;

import java.util.UUID;

@RequiredArgsConstructor
public class UserFactory {

    private final PasswordEncoder passwordEncoder;

    public User create(UUID id, String email, String password) {
        return new User(id, email, passwordEncoder.encode(password));
    }
}
