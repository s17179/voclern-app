package pl.voclern.vocabulary.adapter.second;

import lombok.RequiredArgsConstructor;
import pl.voclern.vocabulary.port.secondary.WordRepository;
import pl.voclern.vocabulary.port.secondary.dto.WordDto;

@RequiredArgsConstructor
class HibernateWordRepository implements WordRepository {

    private final HibernateWordEntityRepository hibernateWordEntityRepository;
    private final WordEntityMapper wordEntityMapper;

    @Override
    public void create(WordDto wordDto) {
        WordEntity wordEntity = wordEntityMapper.toEntity(wordDto);

        hibernateWordEntityRepository.save(wordEntity);
    }
}
