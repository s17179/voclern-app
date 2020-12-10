package pl.voclern.shared;

public interface UseCase<T extends UseCaseContract> {

    void perform(T contract);
}
