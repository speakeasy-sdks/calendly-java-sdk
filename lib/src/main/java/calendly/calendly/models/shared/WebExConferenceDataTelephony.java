/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebExConferenceDataTelephony {
    @JsonProperty("callInNumbers")public WebExConferenceDataTelephonyCallInNumbers[] callInNumbers;
    public WebExConferenceDataTelephony withCallInNumbers(WebExConferenceDataTelephonyCallInNumbers[] callInNumbers) {
        this.callInNumbers = callInNumbers;
        return this;
    }
    
}
