/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListScheduledEvents403ApplicationJSON - Permission Denied
 */
public class ListScheduledEvents403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public ListScheduledEvents403ApplicationJSONMessageEnum message;
    public ListScheduledEvents403ApplicationJSON withMessage(ListScheduledEvents403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public ListScheduledEvents403ApplicationJSONTitleEnum title;
    public ListScheduledEvents403ApplicationJSON withTitle(ListScheduledEvents403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
