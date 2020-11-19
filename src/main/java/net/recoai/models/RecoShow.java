package net.recoai.models;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class RecoShow {
    private Map<String, String> additionalURIParams;
    private EventDetail eventDetail;
    private Long eventTime;
    private EventType eventType;
    private String experimentID;
    private ProductDetailsRecoShow[] items;
    private Location location;
    private String placementName;
    private UserInfo userInfo;

    @JsonProperty("additional_uri_params")
    public Map<String, String> getAdditionalURIParams() { return additionalURIParams; }
    @JsonProperty("additional_uri_params")
    public void setAdditionalURIParams(Map<String, String> value) { this.additionalURIParams = value; }

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

    @JsonProperty("experiment_id")
    public String getExperimentID() { return experimentID; }
    @JsonProperty("experiment_id")
    public void setExperimentID(String value) { this.experimentID = value; }

    @JsonProperty("items")
    public ProductDetailsRecoShow[] getItems() { return items; }
    @JsonProperty("items")
    public void setItems(ProductDetailsRecoShow[] value) { this.items = value; }

    @JsonProperty("location")
    public Location getLocation() { return location; }
    @JsonProperty("location")
    public void setLocation(Location value) { this.location = value; }

    @JsonProperty("placement_name")
    public String getPlacementName() { return placementName; }
    @JsonProperty("placement_name")
    public void setPlacementName(String value) { this.placementName = value; }

    @JsonProperty("user_info")
    public UserInfo getUserInfo() { return userInfo; }
    @JsonProperty("user_info")
    public void setUserInfo(UserInfo value) { this.userInfo = value; }
}
