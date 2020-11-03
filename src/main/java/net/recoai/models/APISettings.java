package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class APISettings {
    private String urlAPI;

    @JsonProperty("url_api")
    public String getURLAPI() { return urlAPI; }
    @JsonProperty("url_api")
    public void setURLAPI(String value) { this.urlAPI = value; }
}
