package pl.voclern.vocabulary.adapter.secondary;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "word")
@NoArgsConstructor
@Getter
@Setter
class WordEntity {

    @Id
    private String id;
    private String value;
    private String translation;
}
