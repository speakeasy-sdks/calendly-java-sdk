/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InPersonMeeting - Information about the physical (in-person) event location
 */
public class InPersonMeeting {
    /**
     * The physical location specified by the event host (publisher)
     */
    @JsonProperty("location")
    public String location;
    public InPersonMeeting withLocation(String location) {
        this.location = location;
        return this;
    }
    
    /**
     * Indicates that the event will be an in-person meeting.
     */
    @JsonProperty("type")
    public InPersonMeetingTypeEnum type;
    public InPersonMeeting withType(InPersonMeetingTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
