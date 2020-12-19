package pl.voclern.vocabulary.adapter.second;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

interface HibernateWordGroupEntityRepository extends CrudRepository<WordGroupEntity, UUID> {
}
