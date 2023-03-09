package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GoogleConference
 * Details about an Event that will take place using a Google Meet / Hangout conference
**/
public class GoogleConference {
    @JsonProperty("join_url")
    public String joinUrl;
    public GoogleConference withJoinUrl(String joinUrl) {
        this.joinUrl = joinUrl;
        return this;
    }
    
    @JsonProperty("status")
    public GoogleConferenceStatusEnum status;
    public GoogleConference withStatus(GoogleConferenceStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("type")
    public GoogleConferenceTypeEnum type;
    public GoogleConference withType(GoogleConferenceTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
