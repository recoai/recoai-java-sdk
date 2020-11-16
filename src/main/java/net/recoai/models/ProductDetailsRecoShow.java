package net.recoai.models;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class ProductDetailsRecoShow {
    private String canonicalProductURI;
    private String[][] categories;
    private Currency currencyCode;
    private String id;
    private Image[] images;
    private ExactPrice price;
    private String productCode;
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

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("images")
    public Image[] getImages() { return images; }
    @JsonProperty("images")
    public void setImages(Image[] value) { this.images = value; }

    @JsonProperty("price")
    public ExactPrice getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(ExactPrice value) { this.price = value; }

    @JsonProperty("product_code")
    public String getProductCode() { return productCode; }
    @JsonProperty("product_code")
    public void setProductCode(String value) { this.productCode = value; }

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
