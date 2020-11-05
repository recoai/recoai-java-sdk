package net.recoai.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum OfflineRecommendationsTypeEnum {
    IMAGE_SIMILARITY, TEXT_SIMILARITY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case IMAGE_SIMILARITY: return "ImageSimilarity";
            case TEXT_SIMILARITY: return "TextSimilarity";
        }
        return null;
    }

    @JsonCreator
    public static OfflineRecommendationsTypeEnum forValue(String value) throws IOException {
        if (value.equals("ImageSimilarity")) return IMAGE_SIMILARITY;
        if (value.equals("TextSimilarity")) return TEXT_SIMILARITY;
        throw new IOException("Cannot deserialize OfflineRecommendationsTypeEnum");
    }
}
