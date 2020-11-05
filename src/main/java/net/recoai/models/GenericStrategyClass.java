package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class GenericStrategyClass {
    private String similarOffline;
    private String query;

    @JsonProperty("SimilarOffline")
    public String getSimilarOffline() { return similarOffline; }
    @JsonProperty("SimilarOffline")
    public void setSimilarOffline(String value) { this.similarOffline = value; }

    @JsonProperty("Query")
    public String getQuery() { return query; }
    @JsonProperty("Query")
    public void setQuery(String value) { this.query = value; }
}
