package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetWebhooksErrorResponse
 * Error Object
**/
public class GetWebhooksErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetWebhooksErrorResponseDetails[] details;
    public GetWebhooksErrorResponse withDetails(GetWebhooksErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetWebhooksErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetWebhooksErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
