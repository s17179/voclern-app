package pl.voclern.vocabulary.adapter.secondary;

import org.mapstruct.Mapper;
import pl.voclern.vocabulary.port.secondary.dto.WordDto;

@Mapper(componentModel = "spring")
interface WordEntityMapper {

    WordEntity toEntity(WordDto wordDto);

    WordDto toDto(WordEntity wordEntity);
}
