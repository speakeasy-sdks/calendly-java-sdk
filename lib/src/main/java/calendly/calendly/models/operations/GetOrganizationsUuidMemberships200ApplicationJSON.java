package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrganizationsUuidMemberships200ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.OrganizationMembership resource;
    public GetOrganizationsUuidMemberships200ApplicationJSON withResource(calendly.calendly.models.shared.OrganizationMembership resource) {
        this.resource = resource;
        return this;
    }
    
}
