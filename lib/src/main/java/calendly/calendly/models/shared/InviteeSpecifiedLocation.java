package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InviteeSpecifiedLocation
 * Information about an event location that’s specified by the invitee.
**/
public class InviteeSpecifiedLocation {
    @JsonProperty("location")
    public String location;
    public InviteeSpecifiedLocation withLocation(String location) {
        this.location = location;
        return this;
    }
    
    @JsonProperty("type")
    public InviteeSpecifiedLocationTypeEnum type;
    public InviteeSpecifiedLocation withType(InviteeSpecifiedLocationTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
