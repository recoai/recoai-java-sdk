package net.recoai.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SortOrder {
    NAME_ASC, NAME_DESC, POPULARITY_ASC, POPULARITY_DESC, PRICE_ASC, PRICE_DESC, RATING_ASC, RATING_DESC;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NAME_ASC: return "NameAsc";
            case NAME_DESC: return "NameDesc";
            case POPULARITY_ASC: return "PopularityAsc";
            case POPULARITY_DESC: return "PopularityDesc";
            case PRICE_ASC: return "PriceAsc";
            case PRICE_DESC: return "PriceDesc";
            case RATING_ASC: return "RatingAsc";
            case RATING_DESC: return "RatingDesc";
        }
        return null;
    }

    @JsonCreator
    public static SortOrder forValue(String value) throws IOException {
        if (value.equals("NameAsc")) return NAME_ASC;
        if (value.equals("NameDesc")) return NAME_DESC;
        if (value.equals("PopularityAsc")) return POPULARITY_ASC;
        if (value.equals("PopularityDesc")) return POPULARITY_DESC;
        if (value.equals("PriceAsc")) return PRICE_ASC;
        if (value.equals("PriceDesc")) return PRICE_DESC;
        if (value.equals("RatingAsc")) return RATING_ASC;
        if (value.equals("RatingDesc")) return RATING_DESC;
        throw new IOException("Cannot deserialize SortOrder");
    }
}
