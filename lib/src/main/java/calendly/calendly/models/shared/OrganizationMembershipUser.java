/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import calendly.calendly.utils.DateTimeDeserializer;
import calendly.calendly.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * OrganizationMembershipUser - Information about the user.
 */
public class OrganizationMembershipUser {
    /**
     * The URL of the user's avatar (image)
     */
    @JsonProperty("avatar_url")
    public String avatarUrl;
    public OrganizationMembershipUser withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    
    /**
     * The moment when the user's record was created (e.g. "2020-01-02T03:04:05.678123Z")
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public OrganizationMembershipUser withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * The user's email address
     */
    @JsonProperty("email")
    public String email;
    public OrganizationMembershipUser withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * The user's name (human-readable format)
     */
    @JsonProperty("name")
    public String name;
    public OrganizationMembershipUser withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The URL of the user's Calendly landing page (that lists all the user's event types)
     */
    @JsonProperty("scheduling_url")
    public String schedulingUrl;
    public OrganizationMembershipUser withSchedulingUrl(String schedulingUrl) {
        this.schedulingUrl = schedulingUrl;
        return this;
    }
    
    /**
     * The portion of URL for the user's scheduling page (where invitees book sessions), rendered in a human-readable format
     */
    @JsonProperty("slug")
    public String slug;
    public OrganizationMembershipUser withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    
    /**
     * The time zone to use when presenting time to the user
     */
    @JsonProperty("timezone")
    public String timezone;
    public OrganizationMembershipUser withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
    /**
     * The moment when the user's record was last updated (e.g. "2020-01-02T03:04:05.678123Z")
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public OrganizationMembershipUser withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    /**
     * Canonical reference (unique identifier) for the user
     */
    @JsonProperty("uri")
    public String uri;
    public OrganizationMembershipUser withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
