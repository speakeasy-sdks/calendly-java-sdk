package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetOrganizationMemberships200ApplicationJSON
 * Service response
**/
public class GetOrganizationMemberships200ApplicationJSON {
    @JsonProperty("collection")
    public calendly.calendly.models.shared.OrganizationMembership[] collection;
    public GetOrganizationMemberships200ApplicationJSON withCollection(calendly.calendly.models.shared.OrganizationMembership[] collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonProperty("pagination")
    public calendly.calendly.models.shared.Pagination pagination;
    public GetOrganizationMemberships200ApplicationJSON withPagination(calendly.calendly.models.shared.Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
}
