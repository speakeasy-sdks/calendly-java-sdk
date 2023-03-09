package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUser200ApplicationJSON
 * Service response
**/
public class GetUser200ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.User resource;
    public GetUser200ApplicationJSON withResource(calendly.calendly.models.shared.User resource) {
        this.resource = resource;
        return this;
    }
    
}
