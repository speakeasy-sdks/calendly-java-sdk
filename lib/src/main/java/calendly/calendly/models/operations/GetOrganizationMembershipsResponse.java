package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetOrganizationMembershipsResponse {
    public String contentType;
    public GetOrganizationMembershipsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetOrganizationMembershipsErrorResponse errorResponse;
    public GetOrganizationMembershipsResponse withErrorResponse(GetOrganizationMembershipsErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public calendly.calendly.models.shared.ErrorResponse errorResponse1;
    public GetOrganizationMembershipsResponse withErrorResponse1(calendly.calendly.models.shared.ErrorResponse errorResponse1) {
        this.errorResponse1 = errorResponse1;
        return this;
    }
    
    public Integer statusCode;
    public GetOrganizationMembershipsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetOrganizationMembershipsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetOrganizationMemberships200ApplicationJSON getOrganizationMemberships200ApplicationJSONObject;
    public GetOrganizationMembershipsResponse withGetOrganizationMemberships200ApplicationJSONObject(GetOrganizationMemberships200ApplicationJSON getOrganizationMemberships200ApplicationJSONObject) {
        this.getOrganizationMemberships200ApplicationJSONObject = getOrganizationMemberships200ApplicationJSONObject;
        return this;
    }
    
}
