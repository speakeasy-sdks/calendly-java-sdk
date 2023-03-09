package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostDataComplianceDeletionInviteesErrorResponse
 * Error Object
**/
public class PostDataComplianceDeletionInviteesErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public PostDataComplianceDeletionInviteesErrorResponseDetails[] details;
    public PostDataComplianceDeletionInviteesErrorResponse withDetails(PostDataComplianceDeletionInviteesErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public PostDataComplianceDeletionInviteesErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public PostDataComplianceDeletionInviteesErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
