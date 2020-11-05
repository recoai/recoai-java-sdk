package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class PlacementUpsert {
    private EventDetail eventDetail;
    private long eventTime;
    private EventType eventType;
    private String name;
    private RankingStrategy ranking;
    private WeightedGenericCandidateRec[] strategies;
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

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("ranking")
    public RankingStrategy getRanking() { return ranking; }
    @JsonProperty("ranking")
    public void setRanking(RankingStrategy value) { this.ranking = value; }

    @JsonProperty("strategies")
    public WeightedGenericCandidateRec[] getStrategies() { return strategies; }
    @JsonProperty("strategies")
    public void setStrategies(WeightedGenericCandidateRec[] value) { this.strategies = value; }

    @JsonProperty("user_info")
    public UserInfo getUserInfo() { return userInfo; }
    @JsonProperty("user_info")
    public void setUserInfo(UserInfo value) { this.userInfo = value; }
}
