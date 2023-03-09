package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetOrganizationsUuidInvitationsErrorResponse
 * Error Object
**/
public class GetOrganizationsUuidInvitationsErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetOrganizationsUuidInvitationsErrorResponseDetails[] details;
    public GetOrganizationsUuidInvitationsErrorResponse withDetails(GetOrganizationsUuidInvitationsErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetOrganizationsUuidInvitationsErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetOrganizationsUuidInvitationsErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}