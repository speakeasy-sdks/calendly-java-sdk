package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetScheduledEventsErrorResponse
 * Error Object
**/
public class GetScheduledEventsErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetScheduledEventsErrorResponseDetails[] details;
    public GetScheduledEventsErrorResponse withDetails(GetScheduledEventsErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetScheduledEventsErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetScheduledEventsErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
