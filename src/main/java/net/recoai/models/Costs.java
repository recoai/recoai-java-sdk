package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class Costs {
    private Double cost;
    private Double manufacturing;

    @JsonProperty("cost")
    public Double getCost() { return cost; }
    @JsonProperty("cost")
    public void setCost(Double value) { this.cost = value; }

    @JsonProperty("manufacturing")
    public Double getManufacturing() { return manufacturing; }
    @JsonProperty("manufacturing")
    public void setManufacturing(Double value) { this.manufacturing = value; }
}
