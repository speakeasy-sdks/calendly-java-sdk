package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubmissionCustomMessageResult
 * Information about the custom message Routing Form Submission result.
**/
public class SubmissionCustomMessageResult {
    @JsonProperty("type")
    public SubmissionCustomMessageResultTypeEnum type;
    public SubmissionCustomMessageResult withType(SubmissionCustomMessageResultTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonProperty("value")
    public SubmissionCustomMessageResultValue value;
    public SubmissionCustomMessageResult withValue(SubmissionCustomMessageResultValue value) {
        this.value = value;
        return this;
    }
    
}
