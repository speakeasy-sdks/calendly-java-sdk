/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostScheduledEventsUuidCancellationApplicationJSON - Optional cancellation reason.
 */
public class PostScheduledEventsUuidCancellationApplicationJSON {
    /**
     * Reason for cancellation
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reason")
    public String reason;
    public PostScheduledEventsUuidCancellationApplicationJSON withReason(String reason) {
        this.reason = reason;
        return this;
    }
    
}
