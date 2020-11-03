package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class UserInfo {
    private UserAdditionalInfo additionalInfo;
    private String sessionID;
    private String userID;
    private String visitorID;

    @JsonProperty("additional_info")
    public UserAdditionalInfo getAdditionalInfo() { return additionalInfo; }
    @JsonProperty("additional_info")
    public void setAdditionalInfo(UserAdditionalInfo value) { this.additionalInfo = value; }

    @JsonProperty("session_id")
    public String getSessionID() { return sessionID; }
    @JsonProperty("session_id")
    public void setSessionID(String value) { this.sessionID = value; }

    @JsonProperty("user_id")
    public String getUserID() { return userID; }
    @JsonProperty("user_id")
    public void setUserID(String value) { this.userID = value; }

    @JsonProperty("visitor_id")
    public String getVisitorID() { return visitorID; }
    @JsonProperty("visitor_id")
    public void setVisitorID(String value) { this.visitorID = value; }
}
