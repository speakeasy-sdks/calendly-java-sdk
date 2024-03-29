/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InviteeSpecifiedLocation - Information about an event location that\u2019s specified by the invitee.
 */
public class InviteeSpecifiedLocation {
    /**
     * The event location description provided by the invitee
     */
    @JsonProperty("location")
    public String location;
    public InviteeSpecifiedLocation withLocation(String location) {
        this.location = location;
        return this;
    }
    
    /**
     * The event location selected by the invitee
     */
    @JsonProperty("type")
    public InviteeSpecifiedLocationTypeEnum type;
    public InviteeSpecifiedLocation withType(InviteeSpecifiedLocationTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
