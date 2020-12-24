package pl.voclern.vocabulary.adapter.secondary;

import org.springframework.data.repository.CrudRepository;

interface HibernateWordGroupEntityRepository extends CrudRepository<WordGroupEntity, String> {
}
