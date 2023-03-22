/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class PostOrganizationsUuidInvitationsResponse {
    public String contentType;
    public PostOrganizationsUuidInvitationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Cannot authenticate caller
     */
    public PostOrganizationsUuidInvitationsErrorResponse errorResponse1;
    public PostOrganizationsUuidInvitationsResponse withErrorResponse1(PostOrganizationsUuidInvitationsErrorResponse errorResponse1) {
        this.errorResponse1 = errorResponse1;
        return this;
    }
    
    /**
     * Bad Request
     */
    public calendly.calendly.models.shared.ErrorResponse errorResponse;
    public PostOrganizationsUuidInvitationsResponse withErrorResponse(calendly.calendly.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public PostOrganizationsUuidInvitationsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public PostOrganizationsUuidInvitationsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Created
     */
    public PostOrganizationsUuidInvitations201ApplicationJSON postOrganizationsUuidInvitations201ApplicationJSONObject;
    public PostOrganizationsUuidInvitationsResponse withPostOrganizationsUuidInvitations201ApplicationJSONObject(PostOrganizationsUuidInvitations201ApplicationJSON postOrganizationsUuidInvitations201ApplicationJSONObject) {
        this.postOrganizationsUuidInvitations201ApplicationJSONObject = postOrganizationsUuidInvitations201ApplicationJSONObject;
        return this;
    }
    
    /**
     * Permission Denied
     */
    public PostOrganizationsUuidInvitations403ApplicationJSON postOrganizationsUuidInvitations403ApplicationJSONObject;
    public PostOrganizationsUuidInvitationsResponse withPostOrganizationsUuidInvitations403ApplicationJSONObject(PostOrganizationsUuidInvitations403ApplicationJSON postOrganizationsUuidInvitations403ApplicationJSONObject) {
        this.postOrganizationsUuidInvitations403ApplicationJSONObject = postOrganizationsUuidInvitations403ApplicationJSONObject;
        return this;
    }
    
}
