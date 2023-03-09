package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ActorGroup
 * User group information about the actor
**/
public class ActorGroup {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public ActorGroup withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    public String role;
    public ActorGroup withRole(String role) {
        this.role = role;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uri")
    public String uri;
    public ActorGroup withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
