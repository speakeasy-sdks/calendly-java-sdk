package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostShares201ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.Share resource;
    public PostShares201ApplicationJSON withResource(calendly.calendly.models.shared.Share resource) {
        this.resource = resource;
        return this;
    }
    
}
