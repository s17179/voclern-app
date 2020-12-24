package pl.voclern.auth;

import lombok.RequiredArgsConstructor;
import pl.voclern.auth.port.primary.contract.RegisterContract;
import pl.voclern.auth.port.secondary.UserRepository;
import pl.voclern.shared.UseCase;

import java.util.UUID;

@RequiredArgsConstructor
class RegisterUseCase implements UseCase<RegisterContract> {

    private final UserFactory userFactory;
    private final UserRepository userRepository;

    @Override
    public void perform(RegisterContract contract) {
        userRepository.add(userFactory.create(UUID.randomUUID(), contract.getEmail(), contract.getPassword()));
    }
}
