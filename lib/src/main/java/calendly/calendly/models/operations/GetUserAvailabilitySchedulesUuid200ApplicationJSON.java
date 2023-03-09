package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUserAvailabilitySchedulesUuid200ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.AvailabilitySchedule resource;
    public GetUserAvailabilitySchedulesUuid200ApplicationJSON withResource(calendly.calendly.models.shared.AvailabilitySchedule resource) {
        this.resource = resource;
        return this;
    }
    
}
