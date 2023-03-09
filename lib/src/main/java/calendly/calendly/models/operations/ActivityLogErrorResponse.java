package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ActivityLogErrorResponse
 * Error Object
**/
public class ActivityLogErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public ActivityLogErrorResponseDetails[] details;
    public ActivityLogErrorResponse withDetails(ActivityLogErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public ActivityLogErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public ActivityLogErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
