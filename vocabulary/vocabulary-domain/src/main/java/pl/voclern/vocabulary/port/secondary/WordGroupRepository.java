package pl.voclern.vocabulary.port.secondary;

import pl.voclern.vocabulary.port.secondary.dto.WordGroupDto;

public interface WordGroupRepository {

    void create(WordGroupDto wordGroupDto);
}
