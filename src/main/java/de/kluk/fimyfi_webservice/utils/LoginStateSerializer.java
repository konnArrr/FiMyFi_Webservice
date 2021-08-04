package de.kluk.fimyfi_webservice.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import de.kluk.fimyfi_webservice.model.LoginState;

import java.io.IOException;

public class LoginStateSerializer extends StdSerializer {

    public LoginStateSerializer() {
        super(LoginState.class);
    }

    public LoginStateSerializer(Class t) {
        super(t);
    }

    @Override
    public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        LoginState loginState = (LoginState) o;
        jsonGenerator.writeStartObject();
        jsonGenerator.writeFieldName("name");
        jsonGenerator.writeString(loginState.name());
        jsonGenerator.writeFieldName("state");
        jsonGenerator.writeNumber(loginState.getState());
        jsonGenerator.writeFieldName("message");
        jsonGenerator.writeString(loginState.getMessage());
        jsonGenerator.writeEndObject();
    }


}
