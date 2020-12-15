package pl.voclern.auth.infrastructure.adapter.secondary;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.voclern.auth.domain.User;
import pl.voclern.auth.domain.port.secondary.exception.UserNotFoundException;
import pl.voclern.auth.domain.port.secondary.UserRepository;
import pl.voclern.auth.infrastructure.HibernateUserEntityRepository;
import pl.voclern.auth.infrastructure.UserEntity;
import pl.voclern.auth.infrastructure.UserMapper;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class HibernateUserRepository implements UserRepository {

    private final UserMapper userMapper;
    private final HibernateUserEntityRepository userEntityRepository;

    @Override
    public void add(User model) {
        UserEntity userEntity = userMapper.mapToUserEntity(model);

        userEntityRepository.save(userEntity);
    }

    @Override
    public User get(UUID id) throws UserNotFoundException {
        UserEntity userEntity = userEntityRepository.findById(id).orElseThrow(UserNotFoundException::new);

        return userMapper.mapToUser(userEntity);
    }

    @Override
    public User getByEmail(String email) throws UserNotFoundException {
        return userMapper.mapToUser(userEntityRepository.findByEmail(email).orElseThrow(UserNotFoundException::new));
    }
}
