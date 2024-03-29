/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetOrganizationsOrgUuidInvitationsUuidErrorResponse - Error Object
 */
public class GetOrganizationsOrgUuidInvitationsUuidErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetOrganizationsOrgUuidInvitationsUuidErrorResponseDetails[] details;
    public GetOrganizationsOrgUuidInvitationsUuidErrorResponse withDetails(GetOrganizationsOrgUuidInvitationsUuidErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetOrganizationsOrgUuidInvitationsUuidErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetOrganizationsOrgUuidInvitationsUuidErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
