package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class ExactPrice {
    private double displayPrice;
    private double originalPrice;

    @JsonProperty("display_price")
    public double getDisplayPrice() { return displayPrice; }
    @JsonProperty("display_price")
    public void setDisplayPrice(double value) { this.displayPrice = value; }

    @JsonProperty("original_price")
    public double getOriginalPrice() { return originalPrice; }
    @JsonProperty("original_price")
    public void setOriginalPrice(double value) { this.originalPrice = value; }
}
