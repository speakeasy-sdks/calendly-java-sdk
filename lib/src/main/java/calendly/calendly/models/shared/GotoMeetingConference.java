package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GotoMeetingConference
 * Details about an Event that will take place using a GotoMeeting conference
**/
public class GotoMeetingConference {
    @JsonProperty("data")
    public GotoMeetingConferenceData data;
    public GotoMeetingConference withData(GotoMeetingConferenceData data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("join_url")
    public String joinUrl;
    public GotoMeetingConference withJoinUrl(String joinUrl) {
        this.joinUrl = joinUrl;
        return this;
    }
    
    @JsonProperty("status")
    public GotoMeetingConferenceStatusEnum status;
    public GotoMeetingConference withStatus(GotoMeetingConferenceStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("type")
    public GotoMeetingConferenceTypeEnum type;
    public GotoMeetingConference withType(GotoMeetingConferenceTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
