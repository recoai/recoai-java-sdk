package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class RankingStrategyClass {
    private Object dirichletSampling;

    @JsonProperty("DirichletSampling")
    public Object getDirichletSampling() { return dirichletSampling; }
    @JsonProperty("DirichletSampling")
    public void setDirichletSampling(Object value) { this.dirichletSampling = value; }
}
