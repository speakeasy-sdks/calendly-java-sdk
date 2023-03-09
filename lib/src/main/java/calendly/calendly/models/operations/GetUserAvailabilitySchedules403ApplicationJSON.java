package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUserAvailabilitySchedules403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public GetUserAvailabilitySchedules403ApplicationJSONMessageEnum message;
    public GetUserAvailabilitySchedules403ApplicationJSON withMessage(GetUserAvailabilitySchedules403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public GetUserAvailabilitySchedules403ApplicationJSONTitleEnum title;
    public GetUserAvailabilitySchedules403ApplicationJSON withTitle(GetUserAvailabilitySchedules403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
