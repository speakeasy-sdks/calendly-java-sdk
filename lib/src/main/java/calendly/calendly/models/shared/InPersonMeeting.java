package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InPersonMeeting
 * Information about the physical (in-person) event location
**/
public class InPersonMeeting {
    @JsonProperty("location")
    public String location;
    public InPersonMeeting withLocation(String location) {
        this.location = location;
        return this;
    }
    
    @JsonProperty("type")
    public InPersonMeetingTypeEnum type;
    public InPersonMeeting withType(InPersonMeetingTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
