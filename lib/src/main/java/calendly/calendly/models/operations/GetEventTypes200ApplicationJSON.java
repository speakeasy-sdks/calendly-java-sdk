package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetEventTypes200ApplicationJSON
 * Service response
**/
public class GetEventTypes200ApplicationJSON {
    @JsonProperty("collection")
    public calendly.calendly.models.shared.EventType[] collection;
    public GetEventTypes200ApplicationJSON withCollection(calendly.calendly.models.shared.EventType[] collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonProperty("pagination")
    public calendly.calendly.models.shared.Pagination pagination;
    public GetEventTypes200ApplicationJSON withPagination(calendly.calendly.models.shared.Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
}
