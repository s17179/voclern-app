package pl.voclern.vocabulary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.voclern.vocabulary.port.primary.VocabularyFacade;
import pl.voclern.vocabulary.port.secondary.WordGroupRepository;
import pl.voclern.vocabulary.port.secondary.WordRepository;

@Configuration
class VocabularyConfig {

    @Bean
    public AddWordUseCase addWordUseCase(WordRepository wordRepository, WordGroupRepository wordGroupRepository) {
        return new AddWordUseCase(wordRepository, wordGroupRepository);
    }

    @Bean
    public AddWordGroupUseCase addWordGroupUseCase(WordGroupRepository wordGroupRepository) {
        return new AddWordGroupUseCase(wordGroupRepository);
    }

    @Bean
    public ListWordGroupsUseCase listWordGroupsUseCase(WordGroupRepository wordGroupRepository) {
        return new ListWordGroupsUseCase(wordGroupRepository);
    }

    @Bean
    public ListWordsUseCase listWordsUseCase(WordRepository wordRepository) {
        return new ListWordsUseCase(wordRepository);
    }

    @Bean
    public RemoveWordUseCase removeWordUseCase(WordRepository wordRepository) {
        return new RemoveWordUseCase(wordRepository);
    }

    @Bean
    public LoadWordUseCase loadWordUseCase(WordRepository wordRepository) {
        return new LoadWordUseCase(wordRepository);
    }

    @Bean
    public VocabularyFacade wordFacade(AddWordUseCase addWordUseCase,
                                       AddWordGroupUseCase addWordGroupUseCase,
                                       ListWordGroupsUseCase listWordGroupsUseCase,
                                       ListWordsUseCase listWordsUseCase,
                                       RemoveWordUseCase removeWordUseCase,
                                       LoadWordUseCase loadWordUseCase) {
        return new VocabularyFacadeImpl(
                addWordUseCase,
                addWordGroupUseCase,
                listWordGroupsUseCase,
                listWordsUseCase,
                removeWordUseCase,
                loadWordUseCase
        );
    }
}
