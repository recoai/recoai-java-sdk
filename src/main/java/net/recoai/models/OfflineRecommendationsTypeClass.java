package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class OfflineRecommendationsTypeClass {
    private String otherSimilarity;

    @JsonProperty("OtherSimilarity")
    public String getOtherSimilarity() { return otherSimilarity; }
    @JsonProperty("OtherSimilarity")
    public void setOtherSimilarity(String value) { this.otherSimilarity = value; }
}
