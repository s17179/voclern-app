package pl.voclern.auth.port.secondary;

import pl.voclern.auth.port.secondary.dto.UserDto;
import pl.voclern.auth.port.secondary.exception.UserNotFoundException;

public interface UserRepository {

    void add(UserDto user);

    UserDto getByEmail(String email) throws UserNotFoundException;
}
