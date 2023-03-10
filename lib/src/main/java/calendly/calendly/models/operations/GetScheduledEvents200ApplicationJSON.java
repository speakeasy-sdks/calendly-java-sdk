package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetScheduledEvents200ApplicationJSON
 * Service response
**/
public class GetScheduledEvents200ApplicationJSON {
    @JsonProperty("collection")
    public calendly.calendly.models.shared.Event[] collection;
    public GetScheduledEvents200ApplicationJSON withCollection(calendly.calendly.models.shared.Event[] collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonProperty("pagination")
    public calendly.calendly.models.shared.Pagination pagination;
    public GetScheduledEvents200ApplicationJSON withPagination(calendly.calendly.models.shared.Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
}
