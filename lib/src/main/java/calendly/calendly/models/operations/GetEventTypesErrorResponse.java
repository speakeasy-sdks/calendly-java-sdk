package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetEventTypesErrorResponse
 * Error Object
**/
public class GetEventTypesErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetEventTypesErrorResponseDetails[] details;
    public GetEventTypesErrorResponse withDetails(GetEventTypesErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetEventTypesErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetEventTypesErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
