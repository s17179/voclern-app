package pl.voclern.vocabulary.adapter.secondary;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "word_group")
@Getter
@Setter
class WordGroupEntity {

    @Id
    private String id;
    private String name;
}
