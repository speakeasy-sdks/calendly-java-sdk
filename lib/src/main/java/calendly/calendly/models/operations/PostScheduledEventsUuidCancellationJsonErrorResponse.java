package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostScheduledEventsUuidCancellationJsonErrorResponse
 * Error Object
**/
public class PostScheduledEventsUuidCancellationJsonErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public PostScheduledEventsUuidCancellationJsonErrorResponseDetails[] details;
    public PostScheduledEventsUuidCancellationJsonErrorResponse withDetails(PostScheduledEventsUuidCancellationJsonErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public PostScheduledEventsUuidCancellationJsonErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public PostScheduledEventsUuidCancellationJsonErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
