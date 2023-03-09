package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetOrganizationsUuidInvitationsResponse {
    public String contentType;
    public GetOrganizationsUuidInvitationsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetOrganizationsUuidInvitationsErrorResponse errorResponse;
    public GetOrganizationsUuidInvitationsResponse withErrorResponse(GetOrganizationsUuidInvitationsErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetOrganizationsUuidInvitationsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetOrganizationsUuidInvitationsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrganizationsUuidInvitations200ApplicationJSON getOrganizationsUuidInvitations200ApplicationJSONObject;
    public GetOrganizationsUuidInvitationsResponse withGetOrganizationsUuidInvitations200ApplicationJSONObject(GetOrganizationsUuidInvitations200ApplicationJSON getOrganizationsUuidInvitations200ApplicationJSONObject) {
        this.getOrganizationsUuidInvitations200ApplicationJSONObject = getOrganizationsUuidInvitations200ApplicationJSONObject;
        return this;
    }
    
}
