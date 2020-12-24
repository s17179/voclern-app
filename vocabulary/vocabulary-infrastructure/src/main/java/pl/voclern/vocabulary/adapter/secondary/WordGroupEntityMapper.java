package pl.voclern.vocabulary.adapter.secondary;

import org.mapstruct.Mapper;
import pl.voclern.vocabulary.port.secondary.dto.WordGroupDto;

@Mapper(componentModel = "spring")
interface WordGroupEntityMapper {

    WordGroupEntity toEntity(WordGroupDto wordGroupDto);

    WordGroupDto toDto(WordGroupEntity wordGroupEntity);
}
