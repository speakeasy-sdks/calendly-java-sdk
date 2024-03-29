/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostScheduledEventsUuidCancellationMultipart201ApplicationJSON - Created
 */
public class PostScheduledEventsUuidCancellationMultipart201ApplicationJSON {
    /**
     * Provides data pertaining to the cancellation of the Event
     */
    @JsonProperty("resource")
    public calendly.calendly.models.shared.Cancellation resource;
    public PostScheduledEventsUuidCancellationMultipart201ApplicationJSON withResource(calendly.calendly.models.shared.Cancellation resource) {
        this.resource = resource;
        return this;
    }
    
}
