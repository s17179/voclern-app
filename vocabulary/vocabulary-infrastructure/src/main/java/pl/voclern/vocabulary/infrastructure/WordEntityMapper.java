package pl.voclern.vocabulary.infrastructure;

import org.mapstruct.Mapper;
import pl.voclern.vocabulary.domain.port.secondary.dto.WordDto;

@Mapper(componentModel = "spring")
interface WordEntityMapper {

    WordEntity toEntity(WordDto wordDto);

    WordDto toDto(WordEntity wordEntity);
}
