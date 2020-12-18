package pl.voclern.vocabulary.domain.port.secondary;

import pl.voclern.vocabulary.domain.port.secondary.dto.WordDto;

public interface WordRepository {

    void create(WordDto wordDto);
}
