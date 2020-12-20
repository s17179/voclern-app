package pl.voclern.vocabulary.port.secondary;

import pl.voclern.vocabulary.port.secondary.dto.WordGroupDto;

import java.util.List;

public interface WordGroupRepository {

    void create(WordGroupDto wordGroupDto);

    List<WordGroupDto> findAll(String id);

    List<WordGroupDto> findByIds(List<String> ids);
}
