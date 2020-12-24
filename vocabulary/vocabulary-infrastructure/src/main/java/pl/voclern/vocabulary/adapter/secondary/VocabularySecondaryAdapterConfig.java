package pl.voclern.vocabulary.adapter.secondary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.vocabulary.port.secondary.WordGroupRepository;
import pl.voclern.vocabulary.port.secondary.WordRepository;

@Configuration
class VocabularySecondaryAdapterConfig {

    @Bean
    public WordRepository wordRepository(HibernateWordEntityRepository hibernateWordEntityRepository,
                                         WordEntityMapper wordEntityMapper) {
        return new HibernateWordRepository(hibernateWordEntityRepository, wordEntityMapper);
    }

    @Bean
    public WordGroupRepository wordGroupRepository(HibernateWordGroupEntityRepository hibernateWordGroupEntityRepository,
                                                   WordGroupEntityMapper wordGroupEntityMapper) {
        return new HibernateWordGroupRepository(hibernateWordGroupEntityRepository, wordGroupEntityMapper);
    }
}
