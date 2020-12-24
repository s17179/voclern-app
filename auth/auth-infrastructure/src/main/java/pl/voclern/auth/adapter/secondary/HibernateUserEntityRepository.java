package pl.voclern.auth.adapter.secondary;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

interface HibernateUserEntityRepository extends CrudRepository<UserEntity, UUID> {

    Optional<UserEntity> findByEmail(String email);
}
