package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class SearchInfo {
    private String query;

    @JsonProperty("query")
    public String getQuery() { return query; }
    @JsonProperty("query")
    public void setQuery(String value) { this.query = value; }
}
