package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InboundCall
 * Invitee will call meeting publisher at the specified phone number
**/
public class InboundCall {
    @JsonProperty("location")
    public String location;
    public InboundCall withLocation(String location) {
        this.location = location;
        return this;
    }
    
    @JsonProperty("type")
    public InboundCallTypeEnum type;
    public InboundCall withType(InboundCallTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
