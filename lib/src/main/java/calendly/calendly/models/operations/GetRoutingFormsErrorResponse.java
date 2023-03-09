package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRoutingFormsErrorResponse
 * Error Object
**/
public class GetRoutingFormsErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetRoutingFormsErrorResponseDetails[] details;
    public GetRoutingFormsErrorResponse withDetails(GetRoutingFormsErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetRoutingFormsErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetRoutingFormsErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
