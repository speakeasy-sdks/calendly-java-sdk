package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrganizationsUuidInvitationsErrorResponseDetails {
    @JsonProperty("message")
    public String message;
    public GetOrganizationsUuidInvitationsErrorResponseDetails withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parameter")
    public String parameter;
    public GetOrganizationsUuidInvitationsErrorResponseDetails withParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }
    
}
