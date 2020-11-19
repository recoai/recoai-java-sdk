package net.recoai.models;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class OfflineRecommendationsUpsert {
    private EventDetail eventDetail;
    private Long eventTime;
    private EventType eventType;
    private Map<String, Map<String, Long>> matrix;
    private OfflineRecommendationsType name;
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

    @JsonProperty("matrix")
    public Map<String, Map<String, Long>> getMatrix() { return matrix; }
    @JsonProperty("matrix")
    public void setMatrix(Map<String, Map<String, Long>> value) { this.matrix = value; }

    @JsonProperty("name")
    public OfflineRecommendationsType getName() { return name; }
    @JsonProperty("name")
    public void setName(OfflineRecommendationsType value) { this.name = value; }

    @JsonProperty("user_info")
    public UserInfo getUserInfo() { return userInfo; }
    @JsonProperty("user_info")
    public void setUserInfo(UserInfo value) { this.userInfo = value; }
}
