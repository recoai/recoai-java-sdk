package net.recoai.models;

import com.fasterxml.jackson.annotation.*;
import java.util.Map;

public class EventDetail {
    private Map<String, String> eventAttributes;
    private Long experimentIDS;
    private String recID;
    private String url;

    @JsonProperty("event_attributes")
    public Map<String, String> getEventAttributes() { return eventAttributes; }
    @JsonProperty("event_attributes")
    public void setEventAttributes(Map<String, String> value) { this.eventAttributes = value; }

    @JsonProperty("experiment_ids")
    public Long getExperimentIDS() { return experimentIDS; }
    @JsonProperty("experiment_ids")
    public void setExperimentIDS(Long value) { this.experimentIDS = value; }

    @JsonProperty("rec_id")
    public String getRecID() { return recID; }
    @JsonProperty("rec_id")
    public void setRecID(String value) { this.recID = value; }

    @JsonProperty("url")
    public String getURL() { return url; }
    @JsonProperty("url")
    public void setURL(String value) { this.url = value; }
}
