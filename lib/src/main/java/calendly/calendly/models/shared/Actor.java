package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Actor
 * The Calendly actor that took the action creating the activity log entry
 * 
 * Specific actors:
 * 
 * <details>
 * <summary>Calendly System</summary>
 * 
 * Used when an action is performed by the Calendly system and not triggered directly by a user interaction.
 * 
 * Example:
 * ```json
 * {
 *     "display_name": "Calendly System",
 *     "type": "System"
 * }
 * ```
 * 
 * </details>
 * 
 * <br />
 * 
 * <details>
 * <summary>Calendly Support</summary>
 * Used when an action is performed by Calendly support.
 * 
 * Example:
 * ```json
 * {
 *   "display_name": "Calendly Support",
 *   "organization": {
 *     "uri": "https://api.calendly.com/organizations/AAAAAAAAAAAAAAAA"
 *   },
 *   "type": "User",
 *   "uri": "https://api.calendly.com/users/AAAAAAAAAAAAAAAA"
 * }
 * ```
 * </details>
 * 
**/
public class Actor {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("alternative_identifier")
    public String alternativeIdentifier;
    public Actor withAlternativeIdentifier(String alternativeIdentifier) {
        this.alternativeIdentifier = alternativeIdentifier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("display_name")
    public String displayName;
    public Actor withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("group")
    public ActorGroup group;
    public Actor withGroup(ActorGroup group) {
        this.group = group;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("organization")
    public ActorOrganization organization;
    public Actor withOrganization(ActorOrganization organization) {
        this.organization = organization;
        return this;
    }
    
    @JsonProperty("type")
    public String type;
    public Actor withType(String type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uri")
    public String uri;
    public Actor withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
