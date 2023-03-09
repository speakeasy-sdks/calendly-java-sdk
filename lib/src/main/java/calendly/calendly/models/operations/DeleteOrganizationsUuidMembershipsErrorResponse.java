package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteOrganizationsUuidMembershipsErrorResponse
 * Error Object
**/
public class DeleteOrganizationsUuidMembershipsErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public DeleteOrganizationsUuidMembershipsErrorResponseDetails[] details;
    public DeleteOrganizationsUuidMembershipsErrorResponse withDetails(DeleteOrganizationsUuidMembershipsErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public DeleteOrganizationsUuidMembershipsErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public DeleteOrganizationsUuidMembershipsErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
