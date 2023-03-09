package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteInviteeNoShowErrorResponse
 * Error Object
**/
public class DeleteInviteeNoShowErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public DeleteInviteeNoShowErrorResponseDetails[] details;
    public DeleteInviteeNoShowErrorResponse withDetails(DeleteInviteeNoShowErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public DeleteInviteeNoShowErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public DeleteInviteeNoShowErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
