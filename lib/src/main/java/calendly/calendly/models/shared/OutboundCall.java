package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OutboundCall
 * Meeting publisher will call the Invitee
**/
public class OutboundCall {
    @JsonProperty("location")
    public String location;
    public OutboundCall withLocation(String location) {
        this.location = location;
        return this;
    }
    
    @JsonProperty("type")
    public OutboundCallTypeEnum type;
    public OutboundCall withType(OutboundCallTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
