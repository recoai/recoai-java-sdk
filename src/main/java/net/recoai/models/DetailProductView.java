package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class DetailProductView {
    private EventDetail eventDetail;
    private long eventTime;
    private EventType eventType;
    private ItemDetails item;
    private String recID;
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

    @JsonProperty("item")
    public ItemDetails getItem() { return item; }
    @JsonProperty("item")
    public void setItem(ItemDetails value) { this.item = value; }

    @JsonProperty("rec_id")
    public String getRecID() { return recID; }
    @JsonProperty("rec_id")
    public void setRecID(String value) { this.recID = value; }

    @JsonProperty("user_info")
    public UserInfo getUserInfo() { return userInfo; }
    @JsonProperty("user_info")
    public void setUserInfo(UserInfo value) { this.userInfo = value; }
}
