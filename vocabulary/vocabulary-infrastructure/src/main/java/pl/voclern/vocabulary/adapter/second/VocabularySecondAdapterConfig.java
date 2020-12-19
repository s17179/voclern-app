package pl.voclern.vocabulary.adapter.second;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.vocabulary.port.secondary.WordRepository;

@Configuration
class VocabularySecondAdapterConfig {

    @Bean
    public WordRepository wordRepository(HibernateWordEntityRepository hibernateWordEntityRepository,
                                         WordEntityMapper wordEntityMapper) {
        return new HibernateWordRepository(hibernateWordEntityRepository, wordEntityMapper);
    }
}
