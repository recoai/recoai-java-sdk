package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class ProductDetailsRecoShow {
    private String canonicalProductURI;
    private String[][] categories;
    private Currency currencyCode;
    private ExactPrice exactPrice;
    private String id;
    private Image[] images;
    private String title;

    @JsonProperty("canonical_product_uri")
    public String getCanonicalProductURI() { return canonicalProductURI; }
    @JsonProperty("canonical_product_uri")
    public void setCanonicalProductURI(String value) { this.canonicalProductURI = value; }

    @JsonProperty("categories")
    public String[][] getCategories() { return categories; }
    @JsonProperty("categories")
    public void setCategories(String[][] value) { this.categories = value; }

    @JsonProperty("currency_code")
    public Currency getCurrencyCode() { return currencyCode; }
    @JsonProperty("currency_code")
    public void setCurrencyCode(Currency value) { this.currencyCode = value; }

    @JsonProperty("exact_price")
    public ExactPrice getExactPrice() { return exactPrice; }
    @JsonProperty("exact_price")
    public void setExactPrice(ExactPrice value) { this.exactPrice = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("images")
    public Image[] getImages() { return images; }
    @JsonProperty("images")
    public void setImages(Image[] value) { this.images = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }
}
