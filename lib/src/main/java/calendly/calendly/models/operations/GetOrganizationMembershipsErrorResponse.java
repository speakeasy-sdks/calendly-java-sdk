package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetOrganizationMembershipsErrorResponse
 * Error Object
**/
public class GetOrganizationMembershipsErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetOrganizationMembershipsErrorResponseDetails[] details;
    public GetOrganizationMembershipsErrorResponse withDetails(GetOrganizationMembershipsErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetOrganizationMembershipsErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetOrganizationMembershipsErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
