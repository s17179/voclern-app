package pl.voclern.vocabulary.domain;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class Word {

    private UUID id;
    private String value;
    private String translation;
}
