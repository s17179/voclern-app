package pl.voclern.auth.adapter.secondary;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.voclern.auth.port.secondary.dto.UserDto;
import pl.voclern.auth.port.secondary.exception.UserNotFoundException;
import pl.voclern.auth.port.secondary.UserRepository;

@Repository
@RequiredArgsConstructor
class HibernateUserRepository implements UserRepository {

    private final UserEntityMapper userEntityMapper;
    private final HibernateUserEntityRepository userEntityRepository;

    @Override
    public void add(UserDto user) {
        userEntityRepository.save(userEntityMapper.mapToEntity(user));
    }

    @Override
    public UserDto getByEmail(String email) throws UserNotFoundException {
        return userEntityMapper.mapToDto(userEntityRepository.findByEmail(email).orElseThrow(UserNotFoundException::new));
    }
}
