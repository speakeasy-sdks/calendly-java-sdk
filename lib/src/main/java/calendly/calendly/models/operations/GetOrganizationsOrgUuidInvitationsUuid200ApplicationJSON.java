package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrganizationsOrgUuidInvitationsUuid200ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.OrganizationInvitation resource;
    public GetOrganizationsOrgUuidInvitationsUuid200ApplicationJSON withResource(calendly.calendly.models.shared.OrganizationInvitation resource) {
        this.resource = resource;
        return this;
    }
    
}
