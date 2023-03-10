package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetRoutingForms200ApplicationJSON {
    @JsonProperty("collection")
    public calendly.calendly.models.shared.RoutingForm[] collection;
    public GetRoutingForms200ApplicationJSON withCollection(calendly.calendly.models.shared.RoutingForm[] collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonProperty("pagination")
    public calendly.calendly.models.shared.Pagination pagination;
    public GetRoutingForms200ApplicationJSON withPagination(calendly.calendly.models.shared.Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
}
