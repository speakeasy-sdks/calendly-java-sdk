package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetScheduledEventsUuidErrorResponse
 * Error Object
**/
public class GetScheduledEventsUuidErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetScheduledEventsUuidErrorResponseDetails[] details;
    public GetScheduledEventsUuidErrorResponse withDetails(GetScheduledEventsUuidErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetScheduledEventsUuidErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetScheduledEventsUuidErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
