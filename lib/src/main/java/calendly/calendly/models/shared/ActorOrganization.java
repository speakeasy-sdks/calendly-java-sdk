package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ActorOrganization {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    public String role;
    public ActorOrganization withRole(String role) {
        this.role = role;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uri")
    public String uri;
    public ActorOrganization withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
