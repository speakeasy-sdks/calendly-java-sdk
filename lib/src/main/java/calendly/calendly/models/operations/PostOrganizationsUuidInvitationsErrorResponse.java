package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostOrganizationsUuidInvitationsErrorResponse
 * Error Object
**/
public class PostOrganizationsUuidInvitationsErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public PostOrganizationsUuidInvitationsErrorResponseDetails[] details;
    public PostOrganizationsUuidInvitationsErrorResponse withDetails(PostOrganizationsUuidInvitationsErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public PostOrganizationsUuidInvitationsErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public PostOrganizationsUuidInvitationsErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
