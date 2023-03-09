package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetEventTypesUuid200ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.EventType resource;
    public GetEventTypesUuid200ApplicationJSON withResource(calendly.calendly.models.shared.EventType resource) {
        this.resource = resource;
        return this;
    }
    
}
