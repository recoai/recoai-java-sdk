package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class ItemDetails {
    private Currency currencyCode;
    private Double displayPrice;
    private String itemID;
    private Double originalPrice;
    private Long quantity;

    @JsonProperty("currency_code")
    public Currency getCurrencyCode() { return currencyCode; }
    @JsonProperty("currency_code")
    public void setCurrencyCode(Currency value) { this.currencyCode = value; }

    @JsonProperty("display_price")
    public Double getDisplayPrice() { return displayPrice; }
    @JsonProperty("display_price")
    public void setDisplayPrice(Double value) { this.displayPrice = value; }

    @JsonProperty("item_id")
    public String getItemID() { return itemID; }
    @JsonProperty("item_id")
    public void setItemID(String value) { this.itemID = value; }

    @JsonProperty("original_price")
    public Double getOriginalPrice() { return originalPrice; }
    @JsonProperty("original_price")
    public void setOriginalPrice(Double value) { this.originalPrice = value; }

    @JsonProperty("quantity")
    public Long getQuantity() { return quantity; }
    @JsonProperty("quantity")
    public void setQuantity(Long value) { this.quantity = value; }
}
