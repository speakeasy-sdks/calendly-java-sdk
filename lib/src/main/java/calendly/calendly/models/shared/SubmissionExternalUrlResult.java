package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubmissionExternalUrlResult
 * Information about the external URL Routing Form Submission result.
**/
public class SubmissionExternalUrlResult {
    @JsonProperty("type")
    public SubmissionExternalUrlResultTypeEnum type;
    public SubmissionExternalUrlResult withType(SubmissionExternalUrlResultTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonProperty("value")
    public String value;
    public SubmissionExternalUrlResult withValue(String value) {
        this.value = value;
        return this;
    }
    
}
