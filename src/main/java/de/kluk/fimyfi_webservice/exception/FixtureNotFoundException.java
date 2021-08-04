package de.kluk.fimyfi_webservice.exception;

public class FixtureNotFoundException extends RuntimeException {
    public FixtureNotFoundException() {
    }

    public FixtureNotFoundException(String message) {
        super(message);
    }

    public FixtureNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
