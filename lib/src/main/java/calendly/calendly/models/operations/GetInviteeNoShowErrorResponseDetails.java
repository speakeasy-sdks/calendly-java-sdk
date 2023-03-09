package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetInviteeNoShowErrorResponseDetails {
    @JsonProperty("message")
    public String message;
    public GetInviteeNoShowErrorResponseDetails withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parameter")
    public String parameter;
    public GetInviteeNoShowErrorResponseDetails withParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }
    
}
