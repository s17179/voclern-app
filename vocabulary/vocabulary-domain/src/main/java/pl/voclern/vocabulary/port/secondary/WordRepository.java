package pl.voclern.vocabulary.port.secondary;

import pl.voclern.vocabulary.port.secondary.dto.WordDto;

public interface WordRepository {

    void create(WordDto wordDto);
}
