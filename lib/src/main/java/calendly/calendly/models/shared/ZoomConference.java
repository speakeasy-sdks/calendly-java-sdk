package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ZoomConference
 * Meeting will take place in a Zoom conference
**/
public class ZoomConference {
    @JsonProperty("data")
    public ZoomConferenceData data;
    public ZoomConference withData(ZoomConferenceData data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("join_url")
    public String joinUrl;
    public ZoomConference withJoinUrl(String joinUrl) {
        this.joinUrl = joinUrl;
        return this;
    }
    
    @JsonProperty("status")
    public ZoomConferenceStatusEnum status;
    public ZoomConference withStatus(ZoomConferenceStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("type")
    public ZoomConferenceTypeEnum type;
    public ZoomConference withType(ZoomConferenceTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
