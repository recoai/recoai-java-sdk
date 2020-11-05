package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class WeightedGenericCandidateRec {
    private GenericStrategy strategy;
    private double weight;

    @JsonProperty("strategy")
    public GenericStrategy getStrategy() { return strategy; }
    @JsonProperty("strategy")
    public void setStrategy(GenericStrategy value) { this.strategy = value; }

    @JsonProperty("weight")
    public double getWeight() { return weight; }
    @JsonProperty("weight")
    public void setWeight(double value) { this.weight = value; }
}
