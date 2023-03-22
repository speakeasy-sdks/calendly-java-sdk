/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUserBusyTimes403ApplicationJSON - Permission Denied
 */
public class GetUserBusyTimes403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")public GetUserBusyTimes403ApplicationJSONMessageEnum message;
    public GetUserBusyTimes403ApplicationJSON withMessage(GetUserBusyTimes403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")public GetUserBusyTimes403ApplicationJSONTitleEnum title;
    public GetUserBusyTimes403ApplicationJSON withTitle(GetUserBusyTimes403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
