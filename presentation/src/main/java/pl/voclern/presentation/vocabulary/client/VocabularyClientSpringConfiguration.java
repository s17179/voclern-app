package pl.voclern.presentation.vocabulary.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.vocabulary.domain.port.primary.WordFacade;

@Configuration
class VocabularyClientSpringConfiguration {

    @Bean
    public VocabularyClient vocabularyClient(WordFacade wordFacade) {
        return new LocalVocabularyClient(wordFacade);
    }
}
