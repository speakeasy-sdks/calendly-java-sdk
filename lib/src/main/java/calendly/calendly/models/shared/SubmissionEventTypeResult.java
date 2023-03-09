package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubmissionEventTypeResult
 * Information about the event type Routing Form Submission result.
**/
public class SubmissionEventTypeResult {
    @JsonProperty("type")
    public SubmissionEventTypeResultTypeEnum type;
    public SubmissionEventTypeResult withType(SubmissionEventTypeResultTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonProperty("value")
    public String value;
    public SubmissionEventTypeResult withValue(String value) {
        this.value = value;
        return this;
    }
    
}
