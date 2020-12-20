package pl.voclern.presentation.client.vocabulary;

import pl.voclern.presentation.client.vocabulary.contract.AddWordContract;
import pl.voclern.presentation.client.vocabulary.contract.AddWordGroupContract;
import pl.voclern.presentation.client.vocabulary.contract.ListWordGroupsContract;
import pl.voclern.presentation.client.vocabulary.contract.ListWordsQueryContract;
import pl.voclern.vocabulary.port.secondary.dto.WordDto;
import pl.voclern.vocabulary.port.secondary.dto.WordGroupDto;

import java.util.List;

public interface VocabularyClient {

    void addWord(AddWordContract contract);

    void addWordGroup(AddWordGroupContract contact);

    List<WordGroupDto> listWordGroups(ListWordGroupsContract contract);

    List<WordDto> listWords(ListWordsQueryContract request);

    void removeWord(String id);

    WordDto get(String id);
}
