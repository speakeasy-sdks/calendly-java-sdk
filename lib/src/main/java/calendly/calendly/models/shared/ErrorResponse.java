package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ErrorResponse
 * Error Object
**/
public class ErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public ErrorResponseDetails[] details;
    public ErrorResponse withDetails(ErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public ErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public ErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
