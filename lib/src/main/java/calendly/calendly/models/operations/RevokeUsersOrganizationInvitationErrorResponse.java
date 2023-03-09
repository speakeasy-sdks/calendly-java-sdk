package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RevokeUsersOrganizationInvitationErrorResponse
 * Error Object
**/
public class RevokeUsersOrganizationInvitationErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public RevokeUsersOrganizationInvitationErrorResponseDetails[] details;
    public RevokeUsersOrganizationInvitationErrorResponse withDetails(RevokeUsersOrganizationInvitationErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public RevokeUsersOrganizationInvitationErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public RevokeUsersOrganizationInvitationErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}