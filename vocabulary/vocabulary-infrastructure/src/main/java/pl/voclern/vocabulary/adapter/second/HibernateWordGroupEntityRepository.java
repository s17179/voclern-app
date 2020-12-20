package pl.voclern.vocabulary.adapter.second;

import org.springframework.data.repository.CrudRepository;

interface HibernateWordGroupEntityRepository extends CrudRepository<WordGroupEntity, String> {
}
