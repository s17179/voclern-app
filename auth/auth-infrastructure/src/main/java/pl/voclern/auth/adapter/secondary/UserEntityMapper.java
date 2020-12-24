package pl.voclern.auth.adapter.secondary;

import org.mapstruct.Mapper;
import pl.voclern.auth.port.secondary.dto.UserDto;

@Mapper(componentModel = "spring")
interface UserEntityMapper {

    UserEntity mapToEntity(UserDto userDto);

    UserDto mapToDto(UserEntity userEntity);
}
