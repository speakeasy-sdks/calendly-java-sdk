package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostSchedulingLinksErrorResponse
 * Error Object
**/
public class PostSchedulingLinksErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public PostSchedulingLinksErrorResponseDetails[] details;
    public PostSchedulingLinksErrorResponse withDetails(PostSchedulingLinksErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public PostSchedulingLinksErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public PostSchedulingLinksErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
