package net.recoai.models;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class ProductDetails {
    private Map<String, String> attributes;
    private Long availableQuantity;
    private String canonicalProductURI;
    private Map<String, String> categoricalAttributes;
    private String[][] categories;
    private Map<String, Double> costs;
    private Currency currencyCode;
    private String description;
    private String id;
    private Image[] images;
    private String itemGroupID;
    private String languageCode;
    private Map<String, Double> numericAttributes;
    private ExactPrice price;
    private String productCode;
    private StockState stockState;
    private String[] tags;
    private String title;

    @JsonProperty("attributes")
    public Map<String, String> getAttributes() { return attributes; }
    @JsonProperty("attributes")
    public void setAttributes(Map<String, String> value) { this.attributes = value; }

    @JsonProperty("available_quantity")
    public Long getAvailableQuantity() { return availableQuantity; }
    @JsonProperty("available_quantity")
    public void setAvailableQuantity(Long value) { this.availableQuantity = value; }

    @JsonProperty("canonical_product_uri")
    public String getCanonicalProductURI() { return canonicalProductURI; }
    @JsonProperty("canonical_product_uri")
    public void setCanonicalProductURI(String value) { this.canonicalProductURI = value; }

    @JsonProperty("categorical_attributes")
    public Map<String, String> getCategoricalAttributes() { return categoricalAttributes; }
    @JsonProperty("categorical_attributes")
    public void setCategoricalAttributes(Map<String, String> value) { this.categoricalAttributes = value; }

    @JsonProperty("categories")
    public String[][] getCategories() { return categories; }
    @JsonProperty("categories")
    public void setCategories(String[][] value) { this.categories = value; }

    @JsonProperty("costs")
    public Map<String, Double> getCosts() { return costs; }
    @JsonProperty("costs")
    public void setCosts(Map<String, Double> value) { this.costs = value; }

    @JsonProperty("currency_code")
    public Currency getCurrencyCode() { return currencyCode; }
    @JsonProperty("currency_code")
    public void setCurrencyCode(Currency value) { this.currencyCode = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("images")
    public Image[] getImages() { return images; }
    @JsonProperty("images")
    public void setImages(Image[] value) { this.images = value; }

    @JsonProperty("item_group_id")
    public String getItemGroupID() { return itemGroupID; }
    @JsonProperty("item_group_id")
    public void setItemGroupID(String value) { this.itemGroupID = value; }

    @JsonProperty("language_code")
    public String getLanguageCode() { return languageCode; }
    @JsonProperty("language_code")
    public void setLanguageCode(String value) { this.languageCode = value; }

    @JsonProperty("numeric_attributes")
    public Map<String, Double> getNumericAttributes() { return numericAttributes; }
    @JsonProperty("numeric_attributes")
    public void setNumericAttributes(Map<String, Double> value) { this.numericAttributes = value; }

    @JsonProperty("price")
    public ExactPrice getPrice() { return price; }
    @JsonProperty("price")
    public void setPrice(ExactPrice value) { this.price = value; }

    @JsonProperty("product_code")
    public String getProductCode() { return productCode; }
    @JsonProperty("product_code")
    public void setProductCode(String value) { this.productCode = value; }

    @JsonProperty("stock_state")
    public StockState getStockState() { return stockState; }
    @JsonProperty("stock_state")
    public void setStockState(StockState value) { this.stockState = value; }

    @JsonProperty("tags")
    public String[] getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(String[] value) { this.tags = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }
}
