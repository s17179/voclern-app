package pl.voclern.auth.infrastructure;

import org.mapstruct.Mapper;
import pl.voclern.auth.domain.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toEntity(User user);

    User toDto(UserEntity userEntity);
}
