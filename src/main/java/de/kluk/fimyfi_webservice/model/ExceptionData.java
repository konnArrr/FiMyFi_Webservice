package de.kluk.fimyfi_webservice.model;

import org.springframework.http.HttpStatus;

public class ExceptionData {
    private String message;
    private int statusCode;

    public ExceptionData(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
