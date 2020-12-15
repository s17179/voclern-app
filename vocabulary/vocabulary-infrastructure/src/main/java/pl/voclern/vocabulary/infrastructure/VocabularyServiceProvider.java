package pl.voclern.vocabulary.infrastructure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.vocabulary.api.addword.AddWordUseCase;
import pl.voclern.vocabulary.domain.AddWordUseCaseImpl;
import pl.voclern.vocabulary.domain.WordFactory;

@Configuration
public class VocabularyServiceProvider {

    @Bean
    public WordFactory wordFactory() {
        return new WordFactory();
    }

    @Bean
    public AddWordUseCase addWordUseCase(WordFactory wordFactory) {
        return new AddWordUseCaseImpl(wordFactory);
    }
}
