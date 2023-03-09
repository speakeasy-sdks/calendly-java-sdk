package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebExConference
 * Details about an Event that will take place using a WebEx conference
**/
public class WebExConference {
    @JsonProperty("data")
    public WebExConferenceData data;
    public WebExConference withData(WebExConferenceData data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("join_url")
    public String joinUrl;
    public WebExConference withJoinUrl(String joinUrl) {
        this.joinUrl = joinUrl;
        return this;
    }
    
    @JsonProperty("status")
    public WebExConferenceStatusEnum status;
    public WebExConference withStatus(WebExConferenceStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("type")
    public WebExConferenceTypeEnum type;
    public WebExConference withType(WebExConferenceTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
