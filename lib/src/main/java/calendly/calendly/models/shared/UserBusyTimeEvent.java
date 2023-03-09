package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserBusyTimeEvent {
    @JsonProperty("uri")
    public String uri;
    public UserBusyTimeEvent withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
