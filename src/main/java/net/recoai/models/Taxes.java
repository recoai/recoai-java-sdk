package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class Taxes {
    private Double local;
    private Double state;

    @JsonProperty("local")
    public Double getLocal() { return local; }
    @JsonProperty("local")
    public void setLocal(Double value) { this.local = value; }

    @JsonProperty("state")
    public Double getState() { return state; }
    @JsonProperty("state")
    public void setState(Double value) { this.state = value; }
}
