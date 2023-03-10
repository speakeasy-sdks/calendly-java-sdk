package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetScheduledEvents403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public GetScheduledEvents403ApplicationJSONMessageEnum message;
    public GetScheduledEvents403ApplicationJSON withMessage(GetScheduledEvents403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public GetScheduledEvents403ApplicationJSONTitleEnum title;
    public GetScheduledEvents403ApplicationJSON withTitle(GetScheduledEvents403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
