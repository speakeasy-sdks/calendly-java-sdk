/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListOrganizationMembershipsErrorResponse - Error Object
 */
public class ListOrganizationMembershipsErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public ListOrganizationMembershipsErrorResponseDetails[] details;
    public ListOrganizationMembershipsErrorResponse withDetails(ListOrganizationMembershipsErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public ListOrganizationMembershipsErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public ListOrganizationMembershipsErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
