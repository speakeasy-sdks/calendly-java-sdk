package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetScheduledEventsUuid200ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.Event resource;
    public GetScheduledEventsUuid200ApplicationJSON withResource(calendly.calendly.models.shared.Event resource) {
        this.resource = resource;
        return this;
    }
    
}
