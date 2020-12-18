package pl.voclern.vocabulary.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.vocabulary.domain.port.secondary.WordRepository;

@Configuration
class VocabularyServiceProvider {

    @Bean
    public WordRepository wordRepository(HibernateWordEntityRepository hibernateWordEntityRepository,
                                         WordEntityMapper wordEntityMapper) {
        return new HibernateWordRepository(hibernateWordEntityRepository, wordEntityMapper);
    }
}
