package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetRoutingFormSubmissions200ApplicationJSON {
    @JsonProperty("collection")
    public calendly.calendly.models.shared.RoutingFormSubmission[] collection;
    public GetRoutingFormSubmissions200ApplicationJSON withCollection(calendly.calendly.models.shared.RoutingFormSubmission[] collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonProperty("pagination")
    public calendly.calendly.models.shared.Pagination pagination;
    public GetRoutingFormSubmissions200ApplicationJSON withPagination(calendly.calendly.models.shared.Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
}
