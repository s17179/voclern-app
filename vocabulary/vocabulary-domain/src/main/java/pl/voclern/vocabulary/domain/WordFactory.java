package pl.voclern.vocabulary.domain;

import java.util.UUID;

public class WordFactory {

    public Word create(UUID id, String value, String translation) {
        return new Word(id, value, translation);
    }
}
