package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class LocationClass {
    private String productPage;
    private String addToCart;
    private String categoryPage;
    private SearchInfo searchPage;
    private PageInfo otherPage;
    private PageInfo unknownPage;

    @JsonProperty("ProductPage")
    public String getProductPage() { return productPage; }
    @JsonProperty("ProductPage")
    public void setProductPage(String value) { this.productPage = value; }

    @JsonProperty("AddToCart")
    public String getAddToCart() { return addToCart; }
    @JsonProperty("AddToCart")
    public void setAddToCart(String value) { this.addToCart = value; }

    @JsonProperty("CategoryPage")
    public String getCategoryPage() { return categoryPage; }
    @JsonProperty("CategoryPage")
    public void setCategoryPage(String value) { this.categoryPage = value; }

    @JsonProperty("SearchPage")
    public SearchInfo getSearchPage() { return searchPage; }
    @JsonProperty("SearchPage")
    public void setSearchPage(SearchInfo value) { this.searchPage = value; }

    @JsonProperty("OtherPage")
    public PageInfo getOtherPage() { return otherPage; }
    @JsonProperty("OtherPage")
    public void setOtherPage(PageInfo value) { this.otherPage = value; }

    @JsonProperty("UnknownPage")
    public PageInfo getUnknownPage() { return unknownPage; }
    @JsonProperty("UnknownPage")
    public void setUnknownPage(PageInfo value) { this.unknownPage = value; }
}
