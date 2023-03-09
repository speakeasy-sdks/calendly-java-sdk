package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostDataComplianceDeletionEventsErrorResponse
 * Error Object
**/
public class PostDataComplianceDeletionEventsErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public PostDataComplianceDeletionEventsErrorResponseDetails[] details;
    public PostDataComplianceDeletionEventsErrorResponse withDetails(PostDataComplianceDeletionEventsErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public PostDataComplianceDeletionEventsErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public PostDataComplianceDeletionEventsErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
