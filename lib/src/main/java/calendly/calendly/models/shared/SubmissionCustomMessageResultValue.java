package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubmissionCustomMessageResultValue
 * Contains an object with custom message headline and body.
**/
public class SubmissionCustomMessageResultValue {
    @JsonProperty("body")
    public String body;
    public SubmissionCustomMessageResultValue withBody(String body) {
        this.body = body;
        return this;
    }
    
    @JsonProperty("headline")
    public String headline;
    public SubmissionCustomMessageResultValue withHeadline(String headline) {
        this.headline = headline;
        return this;
    }
    
}
