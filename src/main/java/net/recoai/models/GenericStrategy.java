package net.recoai.models;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = GenericStrategy.Deserializer.class)
@JsonSerialize(using = GenericStrategy.Serializer.class)
public class GenericStrategy {
    public GenericStrategyClass genericStrategyClassValue;
    public GenericStrategyEnum enumValue;

    static class Deserializer extends JsonDeserializer<GenericStrategy> {
        @Override
        public GenericStrategy deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            GenericStrategy value = new GenericStrategy();
            switch (jsonParser.currentToken()) {
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = GenericStrategyEnum.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                case START_OBJECT:
                    value.genericStrategyClassValue = jsonParser.readValueAs(GenericStrategyClass.class);
                    break;
                default: throw new IOException("Cannot deserialize GenericStrategy");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<GenericStrategy> {
        @Override
        public void serialize(GenericStrategy obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.genericStrategyClassValue != null) {
                jsonGenerator.writeObject(obj.genericStrategyClassValue);
                return;
            }
            if (obj.enumValue != null) {
                jsonGenerator.writeObject(obj.enumValue);
                return;
            }
            throw new IOException("GenericStrategy must not be null");
        }
    }
}
