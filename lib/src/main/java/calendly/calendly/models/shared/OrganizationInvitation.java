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
 * OrganizationInvitation
 * Organization Invitation object
**/
public class OrganizationInvitation {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public OrganizationInvitation withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("email")
    public String email;
    public OrganizationInvitation withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("last_sent_at")
    public OffsetDateTime lastSentAt;
    public OrganizationInvitation withLastSentAt(OffsetDateTime lastSentAt) {
        this.lastSentAt = lastSentAt;
        return this;
    }
    
    @JsonProperty("organization")
    public String organization;
    public OrganizationInvitation withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @JsonProperty("status")
    public OrganizationInvitationStatusEnum status;
    public OrganizationInvitation withStatus(OrganizationInvitationStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public OrganizationInvitation withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("uri")
    public String uri;
    public OrganizationInvitation withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public String user;
    public OrganizationInvitation withUser(String user) {
        this.user = user;
        return this;
    }
    
}
