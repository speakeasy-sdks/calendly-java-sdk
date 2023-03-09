package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUserBusyTimesErrorResponse
 * Error Object
**/
public class GetUserBusyTimesErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetUserBusyTimesErrorResponseDetails[] details;
    public GetUserBusyTimesErrorResponse withDetails(GetUserBusyTimesErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetUserBusyTimesErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetUserBusyTimesErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
