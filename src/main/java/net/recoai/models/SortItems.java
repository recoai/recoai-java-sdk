package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class SortItems {
    private EventDetail eventDetail;
    private Long eventTime;
    private EventType eventType;
    private SortOrder sortOrder;
    private UserInfo userInfo;

    @JsonProperty("event_detail")
    public EventDetail getEventDetail() { return eventDetail; }
    @JsonProperty("event_detail")
    public void setEventDetail(EventDetail value) { this.eventDetail = value; }

    @JsonProperty("event_time")
    public Long getEventTime() { return eventTime; }
    @JsonProperty("event_time")
    public void setEventTime(Long value) { this.eventTime = value; }

    @JsonProperty("event_type")
    public EventType getEventType() { return eventType; }
    @JsonProperty("event_type")
    public void setEventType(EventType value) { this.eventType = value; }

    @JsonProperty("sort_order")
    public SortOrder getSortOrder() { return sortOrder; }
    @JsonProperty("sort_order")
    public void setSortOrder(SortOrder value) { this.sortOrder = value; }

    @JsonProperty("user_info")
    public UserInfo getUserInfo() { return userInfo; }
    @JsonProperty("user_info")
    public void setUserInfo(UserInfo value) { this.userInfo = value; }
}
