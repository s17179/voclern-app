package pl.voclern.presentation.client.vocabulary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.vocabulary.port.primary.VocabularyFacade;

@Configuration
class VocabularyClientSpringConfiguration {

    @Bean
    public VocabularyClient vocabularyClient(VocabularyFacade vocabularyFacade) {
        return new LocalVocabularyClient(vocabularyFacade);
    }
}
