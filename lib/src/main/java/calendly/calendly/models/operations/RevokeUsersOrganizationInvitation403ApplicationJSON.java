/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RevokeUsersOrganizationInvitation403ApplicationJSON - Permission Denied
 */
public class RevokeUsersOrganizationInvitation403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public RevokeUsersOrganizationInvitation403ApplicationJSONMessageEnum message;
    public RevokeUsersOrganizationInvitation403ApplicationJSON withMessage(RevokeUsersOrganizationInvitation403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public RevokeUsersOrganizationInvitation403ApplicationJSONTitleEnum title;
    public RevokeUsersOrganizationInvitation403ApplicationJSON withTitle(RevokeUsersOrganizationInvitation403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
