package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetOrganizationsOrgUuidInvitationsUuidResponse {
    public String contentType;
    public GetOrganizationsOrgUuidInvitationsUuidResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetOrganizationsOrgUuidInvitationsUuidErrorResponse errorResponse;
    public GetOrganizationsOrgUuidInvitationsUuidResponse withErrorResponse(GetOrganizationsOrgUuidInvitationsUuidErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetOrganizationsOrgUuidInvitationsUuidResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetOrganizationsOrgUuidInvitationsUuidResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrganizationsOrgUuidInvitationsUuid200ApplicationJSON getOrganizationsOrgUuidInvitationsUuid200ApplicationJSONObject;
    public GetOrganizationsOrgUuidInvitationsUuidResponse withGetOrganizationsOrgUuidInvitationsUuid200ApplicationJSONObject(GetOrganizationsOrgUuidInvitationsUuid200ApplicationJSON getOrganizationsOrgUuidInvitationsUuid200ApplicationJSONObject) {
        this.getOrganizationsOrgUuidInvitationsUuid200ApplicationJSONObject = getOrganizationsOrgUuidInvitationsUuid200ApplicationJSONObject;
        return this;
    }
    
}
