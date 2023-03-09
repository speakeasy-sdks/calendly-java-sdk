package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostInviteeNoShow201ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.InviteeNoShow resource;
    public PostInviteeNoShow201ApplicationJSON withResource(calendly.calendly.models.shared.InviteeNoShow resource) {
        this.resource = resource;
        return this;
    }
    
}
