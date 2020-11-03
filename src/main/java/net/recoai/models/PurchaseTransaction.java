package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class PurchaseTransaction {
    private Costs costs;
    private Currency currencyCode;
    private String id;
    private double revenue;
    private Taxes taxes;

    @JsonProperty("costs")
    public Costs getCosts() { return costs; }
    @JsonProperty("costs")
    public void setCosts(Costs value) { this.costs = value; }

    @JsonProperty("currency_code")
    public Currency getCurrencyCode() { return currencyCode; }
    @JsonProperty("currency_code")
    public void setCurrencyCode(Currency value) { this.currencyCode = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("revenue")
    public double getRevenue() { return revenue; }
    @JsonProperty("revenue")
    public void setRevenue(double value) { this.revenue = value; }

    @JsonProperty("taxes")
    public Taxes getTaxes() { return taxes; }
    @JsonProperty("taxes")
    public void setTaxes(Taxes value) { this.taxes = value; }
}
