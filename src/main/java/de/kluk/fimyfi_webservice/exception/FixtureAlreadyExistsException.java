package de.kluk.fimyfi_webservice.exception;

public class FixtureAlreadyExistsException extends RuntimeException{
    public FixtureAlreadyExistsException() {
    }

    public FixtureAlreadyExistsException(String message) {
        super(message);
    }
}
