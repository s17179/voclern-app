package pl.voclern.vocabulary.adapter.second;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "word")
@Getter
@Setter
class WordEntity {

    @Id
    private String id;
    private String value;
    private String translation;
}
