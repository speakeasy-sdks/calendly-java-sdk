package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class DeleteOrganizationsUuidMembershipsResponse {
    public String contentType;
    public DeleteOrganizationsUuidMembershipsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public DeleteOrganizationsUuidMembershipsErrorResponse errorResponse;
    public DeleteOrganizationsUuidMembershipsResponse withErrorResponse(DeleteOrganizationsUuidMembershipsErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public calendly.calendly.models.shared.ErrorResponse errorResponse1;
    public DeleteOrganizationsUuidMembershipsResponse withErrorResponse1(calendly.calendly.models.shared.ErrorResponse errorResponse1) {
        this.errorResponse1 = errorResponse1;
        return this;
    }
    
    public Integer statusCode;
    public DeleteOrganizationsUuidMembershipsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public DeleteOrganizationsUuidMembershipsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
