package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MicrosoftTeamsConference
 * Meeting will take place in a Microsoft Teams conference
**/
public class MicrosoftTeamsConference {
    @JsonProperty("data")
    public MicrosoftTeamsConferenceData data;
    public MicrosoftTeamsConference withData(MicrosoftTeamsConferenceData data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("join_url")
    public String joinUrl;
    public MicrosoftTeamsConference withJoinUrl(String joinUrl) {
        this.joinUrl = joinUrl;
        return this;
    }
    
    @JsonProperty("status")
    public MicrosoftTeamsConferenceStatusEnum status;
    public MicrosoftTeamsConference withStatus(MicrosoftTeamsConferenceStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("type")
    public MicrosoftTeamsConferenceTypeEnum type;
    public MicrosoftTeamsConference withType(MicrosoftTeamsConferenceTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
