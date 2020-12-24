package pl.voclern.vocabulary.adapter.secondary;

import org.springframework.data.repository.CrudRepository;

interface HibernateWordEntityRepository extends CrudRepository<WordEntity, String> {
}
