/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebExConferenceData - The conference metadata supplied by GoToMeeting
 */
public class WebExConferenceData {
    /**
     * Canonical reference (unique identifier) for the WebEx conference
     */
    @JsonProperty("id")
    public String id;
    public WebExConferenceData withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("password")
    public String password;
    public WebExConferenceData withPassword(String password) {
        this.password = password;
        return this;
    }
    
    @JsonProperty("telephony")
    public WebExConferenceDataTelephony telephony;
    public WebExConferenceData withTelephony(WebExConferenceDataTelephony telephony) {
        this.telephony = telephony;
        return this;
    }
    
}
