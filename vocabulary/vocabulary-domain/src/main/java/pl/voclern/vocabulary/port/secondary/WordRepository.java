package pl.voclern.vocabulary.port.secondary;

import pl.voclern.vocabulary.port.secondary.dto.WordDto;

import java.util.List;

public interface WordRepository {

    void create(WordDto wordDto);

    List<WordDto> findAll();

    void remove(String id);

    WordDto get(String id);
}
