package org.example;

public class LowAgeException extends RuntimeException {
    public LowAgeException(String getMessage) {
        super(getMessage);
    }
}
