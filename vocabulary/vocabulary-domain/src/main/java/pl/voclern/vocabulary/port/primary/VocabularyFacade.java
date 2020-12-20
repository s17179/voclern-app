package pl.voclern.vocabulary.port.primary;

import pl.voclern.vocabulary.port.primary.contract.AddWordContract;
import pl.voclern.vocabulary.port.primary.contract.AddWordGroupContract;
import pl.voclern.vocabulary.port.primary.contract.ListWordGroupsContract;
import pl.voclern.vocabulary.port.primary.contract.ListWordsQueryContract;
import pl.voclern.vocabulary.port.secondary.dto.WordDto;
import pl.voclern.vocabulary.port.secondary.dto.WordGroupDto;

import java.util.List;

public interface VocabularyFacade {

    void addWord(AddWordContract contract);

    void addWordGroup(AddWordGroupContract contact);

    List<WordGroupDto> listWordGroups(ListWordGroupsContract contract);

    List<WordDto> listWords(ListWordsQueryContract contract);

    void removeWord(String id);

    WordDto get(String id);
}
