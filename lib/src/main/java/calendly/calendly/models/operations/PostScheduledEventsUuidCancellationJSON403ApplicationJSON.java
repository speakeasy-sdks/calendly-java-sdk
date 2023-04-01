/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostScheduledEventsUuidCancellationJSON403ApplicationJSON - Caller not authorized to perform this action
 */
public class PostScheduledEventsUuidCancellationJSON403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public PostScheduledEventsUuidCancellationJSON403ApplicationJSONMessageEnum message;
    public PostScheduledEventsUuidCancellationJSON403ApplicationJSON withMessage(PostScheduledEventsUuidCancellationJSON403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public PostScheduledEventsUuidCancellationJSON403ApplicationJSONTitleEnum title;
    public PostScheduledEventsUuidCancellationJSON403ApplicationJSON withTitle(PostScheduledEventsUuidCancellationJSON403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
