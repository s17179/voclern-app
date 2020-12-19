package pl.voclern.vocabulary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.vocabulary.port.primary.WordFacade;
import pl.voclern.vocabulary.port.secondary.WordRepository;

@Configuration
class VocabularyConfig {

    @Bean
    public AddWordUseCase addWordUseCase(WordRepository wordRepository) {
        return new AddWordUseCase(wordRepository);
    }

    @Bean
    public WordFacade wordFacade(AddWordUseCase addWordUseCase) {
        return new WordFacadeImpl(addWordUseCase);
    }
}
