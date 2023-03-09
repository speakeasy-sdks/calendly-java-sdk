package calendly.calendly.models.shared;

import calendly.calendly.utils.DateTimeDeserializer;
import calendly.calendly.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * Entry
 * Object for a created activity log record
**/
public class Entry {
    @JsonProperty("action")
    public String action;
    public Entry withAction(String action) {
        this.action = action;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("actor")
    public Actor actor;
    public Entry withActor(Actor actor) {
        this.actor = actor;
        return this;
    }
    
    @JsonProperty("details")
    public java.util.Map<String, Object> details;
    public Entry withDetails(java.util.Map<String, Object> details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("fully_qualified_name")
    public String fullyQualifiedName;
    public Entry withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }
    
    @JsonProperty("namespace")
    public String namespace;
    public Entry withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("occurred_at")
    public OffsetDateTime occurredAt;
    public Entry withOccurredAt(OffsetDateTime occurredAt) {
        this.occurredAt = occurredAt;
        return this;
    }
    
    @JsonProperty("organization")
    public String organization;
    public Entry withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @JsonProperty("uri")
    public String uri;
    public Entry withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
