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
 * InviteeNoShow1 - Provides data pertaining to the associated no show for the Invitee
 */
public class InviteeNoShow1 {
    /**
     * The moment when the no show was created
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public InviteeNoShow1 withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * Canonical reference (unique identifier) for the no show
     */
    @JsonProperty("uri")
    public String uri;
    public InviteeNoShow1 withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
