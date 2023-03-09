package calendly.calendly.models.shared;

import calendly.calendly.utils.DateTimeDeserializer;
import calendly.calendly.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * RoutingForm
 * Information about a routing form.
**/
public class RoutingForm {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public RoutingForm withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public RoutingForm withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("organization")
    public String organization;
    public RoutingForm withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @JsonProperty("questions")
    public Question[] questions;
    public RoutingForm withQuestions(Question[] questions) {
        this.questions = questions;
        return this;
    }
    
    @JsonProperty("status")
    public RoutingFormStatusEnum status;
    public RoutingForm withStatus(RoutingFormStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public RoutingForm withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("uri")
    public String uri;
    public RoutingForm withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
