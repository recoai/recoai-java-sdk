package net.recoai.models;

import java.io.IOException;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

@JsonDeserialize(using = OfflineRecommendationsType.Deserializer.class)
@JsonSerialize(using = OfflineRecommendationsType.Serializer.class)
public class OfflineRecommendationsType {
    public OfflineRecommendationsTypeClass offlineRecommendationsTypeClassValue;
    public OfflineRecommendationsTypeEnum enumValue;

    static class Deserializer extends JsonDeserializer<OfflineRecommendationsType> {
        @Override
        public OfflineRecommendationsType deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            OfflineRecommendationsType value = new OfflineRecommendationsType();
            switch (jsonParser.currentToken()) {
                case VALUE_STRING:
                    String string = jsonParser.readValueAs(String.class);
                    try {
                        value.enumValue = OfflineRecommendationsTypeEnum.forValue(string);
                    } catch (Exception ex) {
                        // Ignored
                    }
                    break;
                case START_OBJECT:
                    value.offlineRecommendationsTypeClassValue = jsonParser.readValueAs(OfflineRecommendationsTypeClass.class);
                    break;
                default: throw new IOException("Cannot deserialize OfflineRecommendationsType");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<OfflineRecommendationsType> {
        @Override
        public void serialize(OfflineRecommendationsType obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.offlineRecommendationsTypeClassValue != null) {
                jsonGenerator.writeObject(obj.offlineRecommendationsTypeClassValue);
                return;
            }
            if (obj.enumValue != null) {
                jsonGenerator.writeObject(obj.enumValue);
                return;
            }
            throw new IOException("OfflineRecommendationsType must not be null");
        }
    }
}
