package pl.voclern.vocabulary.adapter.second;

import lombok.RequiredArgsConstructor;
import pl.voclern.vocabulary.port.secondary.WordGroupRepository;
import pl.voclern.vocabulary.port.secondary.dto.WordGroupDto;

@RequiredArgsConstructor
class HibernateWordGroupRepository implements WordGroupRepository {

    private final HibernateWordGroupEntityRepository hibernateWordGroupEntityRepository;
    private final WordGroupEntityMapper wordGroupEntityMapper;

    @Override
    public void create(WordGroupDto wordGroupDto) {
        WordGroupEntity wordGroupEntity = wordGroupEntityMapper.toEntity(wordGroupDto);

        hibernateWordGroupEntityRepository.save(wordGroupEntity);
    }
}
