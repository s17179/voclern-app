package pl.voclern.vocabulary.port.secondary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class WordGroupDto {

    private UUID id;
    private String name;
}
