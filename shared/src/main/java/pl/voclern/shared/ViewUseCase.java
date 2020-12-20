package pl.voclern.shared;

public interface ViewUseCase<R, T extends UseCaseContract> {

    R view(T contract);
}
