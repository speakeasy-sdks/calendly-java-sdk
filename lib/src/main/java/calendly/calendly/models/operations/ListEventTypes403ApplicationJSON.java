/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListEventTypes403ApplicationJSON - Permission Denied
 */
public class ListEventTypes403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public ListEventTypes403ApplicationJSONMessageEnum message;
    public ListEventTypes403ApplicationJSON withMessage(ListEventTypes403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public ListEventTypes403ApplicationJSONTitleEnum title;
    public ListEventTypes403ApplicationJSON withTitle(ListEventTypes403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
