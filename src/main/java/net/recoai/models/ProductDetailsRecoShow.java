package net.recoai.models;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class ProductDetailsRecoShow {
    private String canonicalProductURI;
    private String[][] categories;
    private Currency currencyCode;
    private ExactPrice exactPrice;
    private String id;
    private Image[] images;
    private String recID;
    private Double score;
    private Map<String, Double> strategiesUsed;
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

    @JsonProperty("rec_id")
    public String getRecID() { return recID; }
    @JsonProperty("rec_id")
    public void setRecID(String value) { this.recID = value; }

    @JsonProperty("score")
    public Double getScore() { return score; }
    @JsonProperty("score")
    public void setScore(Double value) { this.score = value; }

    @JsonProperty("strategies_used")
    public Map<String, Double> getStrategiesUsed() { return strategiesUsed; }
    @JsonProperty("strategies_used")
    public void setStrategiesUsed(Map<String, Double> value) { this.strategiesUsed = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }
}
