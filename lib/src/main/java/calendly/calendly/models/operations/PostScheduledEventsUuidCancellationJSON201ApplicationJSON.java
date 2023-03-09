package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostScheduledEventsUuidCancellationJSON201ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.Cancellation resource;
    public PostScheduledEventsUuidCancellationJSON201ApplicationJSON withResource(calendly.calendly.models.shared.Cancellation resource) {
        this.resource = resource;
        return this;
    }
    
}
