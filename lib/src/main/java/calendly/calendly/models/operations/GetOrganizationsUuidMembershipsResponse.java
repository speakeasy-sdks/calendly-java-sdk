package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetOrganizationsUuidMembershipsResponse {
    public String contentType;
    public GetOrganizationsUuidMembershipsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetOrganizationsUuidMembershipsErrorResponse errorResponse;
    public GetOrganizationsUuidMembershipsResponse withErrorResponse(GetOrganizationsUuidMembershipsErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public calendly.calendly.models.shared.ErrorResponse errorResponse1;
    public GetOrganizationsUuidMembershipsResponse withErrorResponse1(calendly.calendly.models.shared.ErrorResponse errorResponse1) {
        this.errorResponse1 = errorResponse1;
        return this;
    }
    
    public Integer statusCode;
    public GetOrganizationsUuidMembershipsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetOrganizationsUuidMembershipsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrganizationsUuidMemberships200ApplicationJSON getOrganizationsUuidMemberships200ApplicationJSONObject;
    public GetOrganizationsUuidMembershipsResponse withGetOrganizationsUuidMemberships200ApplicationJSONObject(GetOrganizationsUuidMemberships200ApplicationJSON getOrganizationsUuidMemberships200ApplicationJSONObject) {
        this.getOrganizationsUuidMemberships200ApplicationJSONObject = getOrganizationsUuidMemberships200ApplicationJSONObject;
        return this;
    }
    
}
