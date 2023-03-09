package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetMyUserAccount200ApplicationJSON
 * Service response
**/
public class GetMyUserAccount200ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.User resource;
    public GetMyUserAccount200ApplicationJSON withResource(calendly.calendly.models.shared.User resource) {
        this.resource = resource;
        return this;
    }
    
}
