package calendly.calendly.models.shared;

import calendly.calendly.utils.DateTimeDeserializer;
import calendly.calendly.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class OrganizationMembership {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public OrganizationMembership withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("organization")
    public String organization;
    public OrganizationMembership withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @JsonProperty("role")
    public OrganizationMembershipRoleEnum role;
    public OrganizationMembership withRole(OrganizationMembershipRoleEnum role) {
        this.role = role;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public OrganizationMembership withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("uri")
    public String uri;
    public OrganizationMembership withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
    @JsonProperty("user")
    public OrganizationMembershipUser user;
    public OrganizationMembership withUser(OrganizationMembershipUser user) {
        this.user = user;
        return this;
    }
    
}
