/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubmissionCustomMessageResult - Information about the custom message Routing Form Submission result.
 */
public class SubmissionCustomMessageResult {
    /**
     * Indicates if the routing form submission resulted in a custom "thank you" message.
     */
    @JsonProperty("type")public SubmissionCustomMessageResultTypeEnum type;
    public SubmissionCustomMessageResult withType(SubmissionCustomMessageResultTypeEnum type) {
        this.type = type;
        return this;
    }
    
    /**
     * Contains an object with custom message headline and body.
     */
    @JsonProperty("value")public SubmissionCustomMessageResultValue value;
    public SubmissionCustomMessageResult withValue(SubmissionCustomMessageResultValue value) {
        this.value = value;
        return this;
    }
    
}
