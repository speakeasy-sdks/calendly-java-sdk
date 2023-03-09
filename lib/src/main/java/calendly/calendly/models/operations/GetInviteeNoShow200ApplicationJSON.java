package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetInviteeNoShow200ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.InviteeNoShow resource;
    public GetInviteeNoShow200ApplicationJSON withResource(calendly.calendly.models.shared.InviteeNoShow resource) {
        this.resource = resource;
        return this;
    }
    
}
