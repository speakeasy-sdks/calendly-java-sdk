package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetEventTypeAvailableTimes200ApplicationJSON
 * Service Response
**/
public class GetEventTypeAvailableTimes200ApplicationJSON {
    @JsonProperty("collection")
    public calendly.calendly.models.shared.EventTypeAvailableTime[] collection;
    public GetEventTypeAvailableTimes200ApplicationJSON withCollection(calendly.calendly.models.shared.EventTypeAvailableTime[] collection) {
        this.collection = collection;
        return this;
    }
    
}
