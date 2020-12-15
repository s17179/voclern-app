package pl.voclern.auth.infrastructure;

import org.mapstruct.Mapper;
import pl.voclern.auth.domain.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity mapToUserEntity(User user);

    User mapToUser(UserEntity userEntity);
}
