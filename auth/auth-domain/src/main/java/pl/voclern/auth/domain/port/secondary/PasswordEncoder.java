package pl.voclern.auth.domain.port.secondary;

public interface PasswordEncoder {

    String encode(CharSequence charSequence);
}
