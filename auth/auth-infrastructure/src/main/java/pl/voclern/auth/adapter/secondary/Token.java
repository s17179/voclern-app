package pl.voclern.auth.adapter.secondary;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Token {

    private final String token;

    private Token() {
        token = UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static Token generateRandom() {
        return new Token();
    }

    @Override
    public String toString() {
        return token;
    }
}
