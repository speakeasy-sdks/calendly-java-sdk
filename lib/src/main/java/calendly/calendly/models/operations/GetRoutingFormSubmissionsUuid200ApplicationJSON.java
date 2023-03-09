package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetRoutingFormSubmissionsUuid200ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.RoutingFormSubmission resource;
    public GetRoutingFormSubmissionsUuid200ApplicationJSON withResource(calendly.calendly.models.shared.RoutingFormSubmission resource) {
        this.resource = resource;
        return this;
    }
    
}
