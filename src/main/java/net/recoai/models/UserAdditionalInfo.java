package net.recoai.models;

import com.fasterxml.jackson.annotation.*;

public class UserAdditionalInfo {
    private Long birthYear;
    private Gender gender;
    private String ip;
    private String location;
    private String sessionID;
    private String userAgent;

    @JsonProperty("birth_year")
    public Long getBirthYear() { return birthYear; }
    @JsonProperty("birth_year")
    public void setBirthYear(Long value) { this.birthYear = value; }

    @JsonProperty("gender")
    public Gender getGender() { return gender; }
    @JsonProperty("gender")
    public void setGender(Gender value) { this.gender = value; }

    @JsonProperty("ip")
    public String getIP() { return ip; }
    @JsonProperty("ip")
    public void setIP(String value) { this.ip = value; }

    @JsonProperty("location")
    public String getLocation() { return location; }
    @JsonProperty("location")
    public void setLocation(String value) { this.location = value; }

    @JsonProperty("session_id")
    public String getSessionID() { return sessionID; }
    @JsonProperty("session_id")
    public void setSessionID(String value) { this.sessionID = value; }

    @JsonProperty("user_agent")
    public String getUserAgent() { return userAgent; }
    @JsonProperty("user_agent")
    public void setUserAgent(String value) { this.userAgent = value; }
}
