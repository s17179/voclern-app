package pl.voclern.vocabulary.port.secondary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class WordDto {

    private String id;
    private String value;
    private String translation;
}
