package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUserAvailabilitySchedulesUuid403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public GetUserAvailabilitySchedulesUuid403ApplicationJSONMessageEnum message;
    public GetUserAvailabilitySchedulesUuid403ApplicationJSON withMessage(GetUserAvailabilitySchedulesUuid403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public GetUserAvailabilitySchedulesUuid403ApplicationJSONTitleEnum title;
    public GetUserAvailabilitySchedulesUuid403ApplicationJSON withTitle(GetUserAvailabilitySchedulesUuid403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
