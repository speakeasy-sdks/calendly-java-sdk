package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrganizationsUuidInvitations200ApplicationJSON {
    @JsonProperty("collection")
    public calendly.calendly.models.shared.OrganizationInvitation[] collection;
    public GetOrganizationsUuidInvitations200ApplicationJSON withCollection(calendly.calendly.models.shared.OrganizationInvitation[] collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonProperty("pagination")
    public calendly.calendly.models.shared.Pagination pagination;
    public GetOrganizationsUuidInvitations200ApplicationJSON withPagination(calendly.calendly.models.shared.Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
}
