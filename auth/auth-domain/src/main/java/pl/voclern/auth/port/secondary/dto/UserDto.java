package pl.voclern.auth.port.secondary.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class UserDto {

    private String id;
    private String email;
    private String password;
}
