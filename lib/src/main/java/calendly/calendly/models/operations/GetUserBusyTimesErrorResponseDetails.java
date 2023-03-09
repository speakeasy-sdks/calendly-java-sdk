package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUserBusyTimesErrorResponseDetails {
    @JsonProperty("message")
    public String message;
    public GetUserBusyTimesErrorResponseDetails withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parameter")
    public String parameter;
    public GetUserBusyTimesErrorResponseDetails withParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }
    
}
