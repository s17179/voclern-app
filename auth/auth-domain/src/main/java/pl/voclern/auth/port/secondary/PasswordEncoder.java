package pl.voclern.auth.port.secondary;

public interface PasswordEncoder {

    String encode(CharSequence charSequence);
}
