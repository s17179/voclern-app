package pl.voclern.auth.infrastructure;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface HibernateUserEntityRepository extends CrudRepository<UserEntity, UUID> {

    Optional<UserEntity> findByEmail(String email);
}
