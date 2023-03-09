package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventEventMemberships {
    @JsonProperty("user")
    public String user;
    public EventEventMemberships withUser(String user) {
        this.user = user;
        return this;
    }
    
}
