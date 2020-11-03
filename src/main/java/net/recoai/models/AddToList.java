package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class AddToList {
    private EventDetail eventDetail;
    private long eventTime;
    private EventType eventType;
    private ItemDetails[] items;
    private String listID;
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

    @JsonProperty("items")
    public ItemDetails[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(ItemDetails[] value) { this.items = value; }

    @JsonProperty("list_id")
    public String getListID() { return listID; }
    @JsonProperty("list_id")
    public void setListID(String value) { this.listID = value; }

    @JsonProperty("user_info")
    public UserInfo getUserInfo() { return userInfo; }
    @JsonProperty("user_info")
    public void setUserInfo(UserInfo value) { this.userInfo = value; }
}
