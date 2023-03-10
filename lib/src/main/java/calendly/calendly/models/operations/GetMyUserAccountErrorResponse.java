package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetMyUserAccountErrorResponse
 * Error Object
**/
public class GetMyUserAccountErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetMyUserAccountErrorResponseDetails[] details;
    public GetMyUserAccountErrorResponse withDetails(GetMyUserAccountErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetMyUserAccountErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetMyUserAccountErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
