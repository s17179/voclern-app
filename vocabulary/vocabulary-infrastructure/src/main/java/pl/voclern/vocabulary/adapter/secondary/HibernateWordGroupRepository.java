package pl.voclern.vocabulary.adapter.secondary;

import lombok.RequiredArgsConstructor;
import pl.voclern.vocabulary.port.secondary.WordGroupRepository;
import pl.voclern.vocabulary.port.secondary.dto.WordGroupDto;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
class HibernateWordGroupRepository implements WordGroupRepository {

    private final HibernateWordGroupEntityRepository hibernateWordGroupEntityRepository;
    private final WordGroupEntityMapper wordGroupEntityMapper;

    @Override
    public void create(WordGroupDto wordGroupDto) {
        WordGroupEntity wordGroupEntity = wordGroupEntityMapper.toEntity(wordGroupDto);

        hibernateWordGroupEntityRepository.save(wordGroupEntity);
    }

    @Override
    public List<WordGroupDto> findAll(String id) {
        List<WordGroupDto> wordGroups = new ArrayList<>();

        hibernateWordGroupEntityRepository
                .findAll()
                .forEach(wordGroupEntity -> wordGroups.add(wordGroupEntityMapper.toDto(wordGroupEntity)));

        return wordGroups;
    }

    @Override
    public List<WordGroupDto> findByIds(List<String> ids) {
        List<WordGroupDto> wordGroups = new ArrayList<>();

        hibernateWordGroupEntityRepository
                .findAllById(ids)
                .forEach(wordGroupEntity -> wordGroups.add(wordGroupEntityMapper.toDto(wordGroupEntity)));

        return wordGroups;
    }
}
