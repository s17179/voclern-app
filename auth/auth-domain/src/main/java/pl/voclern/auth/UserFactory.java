package pl.voclern.auth;

import lombok.RequiredArgsConstructor;
import pl.voclern.auth.port.secondary.PasswordEncoder;
import pl.voclern.auth.port.secondary.dto.UserDto;

import java.util.UUID;

@RequiredArgsConstructor
class UserFactory {

    private final PasswordEncoder passwordEncoder;

    public UserDto create(UUID id, String email, String password) {
        return new UserDto(id.toString(), email, passwordEncoder.encode(password));
    }
}
