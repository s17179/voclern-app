package pl.voclern.vocabulary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.vocabulary.port.primary.VocabularyFacade;
import pl.voclern.vocabulary.port.secondary.WordGroupRepository;
import pl.voclern.vocabulary.port.secondary.WordRepository;

@Configuration
class VocabularyConfig {

    @Bean
    public AddWordUseCase addWordUseCase(WordRepository wordRepository) {
        return new AddWordUseCase(wordRepository);
    }

    @Bean
    public AddWordGroupUseCase addWordGroupUseCase(WordGroupRepository wordGroupRepository) {
        return new AddWordGroupUseCase(wordGroupRepository);
    }

    @Bean
    public VocabularyFacade wordFacade(AddWordUseCase addWordUseCase, AddWordGroupUseCase addWordGroupUseCase) {
        return new VocabularyFacadeImpl(addWordUseCase, addWordGroupUseCase);
    }
}
