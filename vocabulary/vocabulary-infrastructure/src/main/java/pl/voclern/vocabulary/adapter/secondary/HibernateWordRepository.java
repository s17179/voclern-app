package pl.voclern.vocabulary.adapter.secondary;

import lombok.RequiredArgsConstructor;
import pl.voclern.vocabulary.port.secondary.WordRepository;
import pl.voclern.vocabulary.port.secondary.dto.WordDto;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
class HibernateWordRepository implements WordRepository {

    private final HibernateWordEntityRepository hibernateWordEntityRepository;
    private final WordEntityMapper wordEntityMapper;

    @Override
    public void create(WordDto wordDto) {
        WordEntity wordEntity = wordEntityMapper.toEntity(wordDto);

        hibernateWordEntityRepository.save(wordEntity);
    }

    @Override
    public List<WordDto> findAll() {
        List<WordDto> words = new ArrayList<>();

        hibernateWordEntityRepository
                .findAll()
                .forEach(wordEntity -> words.add(wordEntityMapper.toDto(wordEntity)));

        return words;
    }

    @Override
    public void remove(String id) {
        hibernateWordEntityRepository.deleteById(id);
    }

    @Override
    public WordDto get(String id) {
        return wordEntityMapper.toDto(hibernateWordEntityRepository.findById(id).orElseThrow());
    }
}
