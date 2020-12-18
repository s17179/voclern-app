package pl.voclern.vocabulary.domain.port.secondary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class WordDto {

    private UUID id;
    private String value;
    private String translation;
}
