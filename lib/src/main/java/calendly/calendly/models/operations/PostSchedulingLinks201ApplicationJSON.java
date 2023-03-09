package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSchedulingLinks201ApplicationJSON {
    @JsonProperty("resource")
    public PostSchedulingLinks201ApplicationJSONResource resource;
    public PostSchedulingLinks201ApplicationJSON withResource(PostSchedulingLinks201ApplicationJSONResource resource) {
        this.resource = resource;
        return this;
    }
    
}
