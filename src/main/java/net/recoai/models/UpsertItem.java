package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class UpsertItem {
    private EventDetail eventDetail;
    private long eventTime;
    private EventType eventType;
    private ProductDetails productDetails;
    private UserInfo userInfo;

    @JsonProperty("event_detail")
    public EventDetail getEventDetail() { return eventDetail; }
    @JsonProperty("event_detail")
    public void setEventDetail(EventDetail value) { this.eventDetail = value; }

    @JsonProperty("event_time")
    public long getEventTime() { return eventTime; }
    @JsonProperty("event_time")
    public void setEventTime(long value) { this.eventTime = value; }

    @JsonProperty("event_type")
    public EventType getEventType() { return eventType; }
    @JsonProperty("event_type")
    public void setEventType(EventType value) { this.eventType = value; }

    @JsonProperty("product_details")
    public ProductDetails getProductDetails() { return productDetails; }
    @JsonProperty("product_details")
    public void setProductDetails(ProductDetails value) { this.productDetails = value; }

    @JsonProperty("user_info")
    public UserInfo getUserInfo() { return userInfo; }
    @JsonProperty("user_info")
    public void setUserInfo(UserInfo value) { this.userInfo = value; }
}
