package pl.voclern.auth.domain;

import lombok.RequiredArgsConstructor;
import pl.voclern.auth.api.port.primary.RegisterUseCase;
import pl.voclern.auth.api.port.primary.RegisterUseCaseContract;
import pl.voclern.auth.domain.port.secondary.UserRepository;

import java.util.UUID;

@RequiredArgsConstructor
public class RegisterUseCaseImpl implements RegisterUseCase {

    private final UserFactory userFactory;
    private final UserRepository userRepository;

    @Override
    public void perform(RegisterUseCaseContract contract) {
        userRepository.add(userFactory.create(UUID.randomUUID(), contract.getEmail(), contract.getPassword()));
    }
}
