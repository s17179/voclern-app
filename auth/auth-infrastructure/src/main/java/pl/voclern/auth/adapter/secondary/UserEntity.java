package pl.voclern.auth.adapter.secondary;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "person")
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    private String id;
    private String email;
    private String password;
    private String token;
}
