package net.recoai.models;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = Location.Deserializer.class)
@JsonSerialize(using = Location.Serializer.class)
public class Location {
    public LocationClass locationClassValue;
    public LocationEnum enumValue;

    static class Deserializer extends JsonDeserializer<Location> {
        @Override
        public Location deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            Location value = new Location();
            switch (jsonParser.currentToken()) {
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = LocationEnum.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                case START_OBJECT:
                    value.locationClassValue = jsonParser.readValueAs(LocationClass.class);
                    break;
                default: throw new IOException("Cannot deserialize Location");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<Location> {
        @Override
        public void serialize(Location obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.locationClassValue != null) {
                jsonGenerator.writeObject(obj.locationClassValue);
                return;
            }
            if (obj.enumValue != null) {
                jsonGenerator.writeObject(obj.enumValue);
                return;
            }
            throw new IOException("Location must not be null");
        }
    }
}
