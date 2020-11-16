package net.recoai.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GenericStrategyEnum {
    ALSO_ADDED_TO_CART, ALSO_PURCHASED, ALSO_SEEN, BESTSELLER_CATEGORY, BESTSELLER_GLOBAL, CONTENT_MATCHING, MOST_PURCHASES, MOST_VIEWS, SEARCH_MATCHING, SEEN_IN_SESSION, SEEN_IN_SESSION_COCCUR_ADDED_TO_CART, SEEN_IN_SESSION_COCCUR_SEEN, SIMILAR_ATTRIBUTES, SIMILAR_IMAGE, SIMILAR_TEXT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ALSO_ADDED_TO_CART: return "AlsoAddedToCart";
            case ALSO_PURCHASED: return "AlsoPurchased";
            case ALSO_SEEN: return "AlsoSeen";
            case BESTSELLER_CATEGORY: return "BestsellerCategory";
            case BESTSELLER_GLOBAL: return "BestsellerGlobal";
            case CONTENT_MATCHING: return "ContentMatching";
            case MOST_PURCHASES: return "MostPurchases";
            case MOST_VIEWS: return "MostViews";
            case SEARCH_MATCHING: return "SearchMatching";
            case SEEN_IN_SESSION: return "SeenInSession";
            case SEEN_IN_SESSION_COCCUR_ADDED_TO_CART: return "SeenInSessionCoccurAddedToCart";
            case SEEN_IN_SESSION_COCCUR_SEEN: return "SeenInSessionCoccurSeen";
            case SIMILAR_ATTRIBUTES: return "SimilarAttributes";
            case SIMILAR_IMAGE: return "SimilarImage";
            case SIMILAR_TEXT: return "SimilarText";
        }
        return null;
    }

    @JsonCreator
    public static GenericStrategyEnum forValue(String value) throws IOException {
        if (value.equals("AlsoAddedToCart")) return ALSO_ADDED_TO_CART;
        if (value.equals("AlsoPurchased")) return ALSO_PURCHASED;
        if (value.equals("AlsoSeen")) return ALSO_SEEN;
        if (value.equals("BestsellerCategory")) return BESTSELLER_CATEGORY;
        if (value.equals("BestsellerGlobal")) return BESTSELLER_GLOBAL;
        if (value.equals("ContentMatching")) return CONTENT_MATCHING;
        if (value.equals("MostPurchases")) return MOST_PURCHASES;
        if (value.equals("MostViews")) return MOST_VIEWS;
        if (value.equals("SearchMatching")) return SEARCH_MATCHING;
        if (value.equals("SeenInSession")) return SEEN_IN_SESSION;
        if (value.equals("SeenInSessionCoccurAddedToCart")) return SEEN_IN_SESSION_COCCUR_ADDED_TO_CART;
        if (value.equals("SeenInSessionCoccurSeen")) return SEEN_IN_SESSION_COCCUR_SEEN;
        if (value.equals("SimilarAttributes")) return SIMILAR_ATTRIBUTES;
        if (value.equals("SimilarImage")) return SIMILAR_IMAGE;
        if (value.equals("SimilarText")) return SIMILAR_TEXT;
        throw new IOException("Cannot deserialize GenericStrategyEnum");
    }
}
