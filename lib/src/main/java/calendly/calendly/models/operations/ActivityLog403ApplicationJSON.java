package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ActivityLog403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public ActivityLog403ApplicationJSONMessageEnum message;
    public ActivityLog403ApplicationJSON withMessage(ActivityLog403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public ActivityLog403ApplicationJSONTitleEnum title;
    public ActivityLog403ApplicationJSON withTitle(ActivityLog403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
