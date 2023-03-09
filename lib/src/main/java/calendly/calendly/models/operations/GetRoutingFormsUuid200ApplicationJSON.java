package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetRoutingFormsUuid200ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.RoutingForm resource;
    public GetRoutingFormsUuid200ApplicationJSON withResource(calendly.calendly.models.shared.RoutingForm resource) {
        this.resource = resource;
        return this;
    }
    
}
