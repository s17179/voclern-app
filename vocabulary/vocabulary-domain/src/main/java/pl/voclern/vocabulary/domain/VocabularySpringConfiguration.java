package pl.voclern.vocabulary.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.vocabulary.domain.port.primary.WordFacade;
import pl.voclern.vocabulary.domain.port.secondary.WordRepository;

@Configuration
class VocabularySpringConfiguration {

    @Bean
    public AddWordUseCase addWordUseCase(WordRepository wordRepository) {
        return new AddWordUseCase(wordRepository);
    }

    @Bean
    public WordFacade wordFacade(AddWordUseCase addWordUseCase) {
        return new WordFacadeImpl(addWordUseCase);
    }
}
