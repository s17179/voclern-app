package pl.voclern.auth.domain.port.secondary;

import pl.voclern.auth.domain.User;
import pl.voclern.auth.domain.port.secondary.exception.UserNotFoundException;

import java.util.UUID;

public interface UserRepository {

    void add(User user);

    User get(UUID id) throws UserNotFoundException;

    User getByEmail(String email) throws UserNotFoundException;
}
