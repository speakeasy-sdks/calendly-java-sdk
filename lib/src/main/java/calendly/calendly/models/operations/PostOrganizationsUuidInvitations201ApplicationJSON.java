package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostOrganizationsUuidInvitations201ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.OrganizationInvitation resource;
    public PostOrganizationsUuidInvitations201ApplicationJSON withResource(calendly.calendly.models.shared.OrganizationInvitation resource) {
        this.resource = resource;
        return this;
    }
    
}
