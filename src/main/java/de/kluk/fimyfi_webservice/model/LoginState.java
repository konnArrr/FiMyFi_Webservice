package de.kluk.fimyfi_webservice.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import de.kluk.fimyfi_webservice.utils.LoginStateSerializer;

import java.util.stream.Stream;

// @JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonSerialize(using = LoginStateSerializer.class)
public enum LoginState {

    INVALID_USER(1, "username is invalid"),
    INVALID_PASSWORD(2, "password is invalid"),
    LOGIN_SUCCESS(3, "login successful")
    ;

    private final int state;
    private final String message;

    LoginState(int state, String message) {
        this.state = state;
        this.message = message;
    }


    public int getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }
}
