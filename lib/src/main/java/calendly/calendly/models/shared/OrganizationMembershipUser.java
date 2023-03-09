package calendly.calendly.models.shared;

import calendly.calendly.utils.DateTimeDeserializer;
import calendly.calendly.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * OrganizationMembershipUser
 * Information about the user.
**/
public class OrganizationMembershipUser {
    @JsonProperty("avatar_url")
    public String avatarUrl;
    public OrganizationMembershipUser withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public OrganizationMembershipUser withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("email")
    public String email;
    public OrganizationMembershipUser withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public OrganizationMembershipUser withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("scheduling_url")
    public String schedulingUrl;
    public OrganizationMembershipUser withSchedulingUrl(String schedulingUrl) {
        this.schedulingUrl = schedulingUrl;
        return this;
    }
    
    @JsonProperty("slug")
    public String slug;
    public OrganizationMembershipUser withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    
    @JsonProperty("timezone")
    public String timezone;
    public OrganizationMembershipUser withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public OrganizationMembershipUser withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("uri")
    public String uri;
    public OrganizationMembershipUser withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
