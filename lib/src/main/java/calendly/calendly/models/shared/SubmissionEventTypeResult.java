/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubmissionEventTypeResult - Information about the event type Routing Form Submission result.
 */
public class SubmissionEventTypeResult {
    /**
     * Indicates that the routing form submission resulted in a redirect to an event type booking page.
     */
    @JsonProperty("type")
    public SubmissionEventTypeResultTypeEnum type;
    public SubmissionEventTypeResult withType(SubmissionEventTypeResultTypeEnum type) {
        this.type = type;
        return this;
    }
    
    /**
     * A reference to the event type resource.
     */
    @JsonProperty("value")
    public String value;
    public SubmissionEventTypeResult withValue(String value) {
        this.value = value;
        return this;
    }
    
}
