package pl.voclern.presentation.client.vocabulary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.vocabulary.port.primary.WordFacade;

@Configuration
class VocabularyClientSpringConfiguration {

    @Bean
    public VocabularyClient vocabularyClient(WordFacade wordFacade) {
        return new LocalVocabularyClient(wordFacade);
    }
}
