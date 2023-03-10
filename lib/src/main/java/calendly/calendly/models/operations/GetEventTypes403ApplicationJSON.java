package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetEventTypes403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public GetEventTypes403ApplicationJSONMessageEnum message;
    public GetEventTypes403ApplicationJSON withMessage(GetEventTypes403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public GetEventTypes403ApplicationJSONTitleEnum title;
    public GetEventTypes403ApplicationJSON withTitle(GetEventTypes403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
