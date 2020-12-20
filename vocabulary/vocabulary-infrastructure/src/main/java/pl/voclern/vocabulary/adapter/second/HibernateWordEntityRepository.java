package pl.voclern.vocabulary.adapter.second;

import org.springframework.data.repository.CrudRepository;

interface HibernateWordEntityRepository extends CrudRepository<WordEntity, String> {
}
