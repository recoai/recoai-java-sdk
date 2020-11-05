package net.recoai.models;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RankingStrategyEnum {
    RANKING_MODEL, THOMSPON_SAMPLING, WEIGHTED_SAMPLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case RANKING_MODEL: return "RankingModel";
            case THOMSPON_SAMPLING: return "ThomsponSampling";
            case WEIGHTED_SAMPLE: return "WeightedSample";
        }
        return null;
    }

    @JsonCreator
    public static RankingStrategyEnum forValue(String value) throws IOException {
        if (value.equals("RankingModel")) return RANKING_MODEL;
        if (value.equals("ThomsponSampling")) return THOMSPON_SAMPLING;
        if (value.equals("WeightedSample")) return WEIGHTED_SAMPLE;
        throw new IOException("Cannot deserialize RankingStrategyEnum");
    }
}
