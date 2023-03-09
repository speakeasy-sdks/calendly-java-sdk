package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class PostDataComplianceDeletionEventsResponse {
    public String contentType;
    public PostDataComplianceDeletionEventsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public PostDataComplianceDeletionEventsErrorResponse errorResponse;
    public PostDataComplianceDeletionEventsResponse withErrorResponse(PostDataComplianceDeletionEventsErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public calendly.calendly.models.shared.ErrorResponse errorResponse1;
    public PostDataComplianceDeletionEventsResponse withErrorResponse1(calendly.calendly.models.shared.ErrorResponse errorResponse1) {
        this.errorResponse1 = errorResponse1;
        return this;
    }
    
    public Integer statusCode;
    public PostDataComplianceDeletionEventsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public PostDataComplianceDeletionEventsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public java.util.Map<String, Object> postDataComplianceDeletionEvents202ApplicationJSONObject;
    public PostDataComplianceDeletionEventsResponse withPostDataComplianceDeletionEvents202ApplicationJSONObject(java.util.Map<String, Object> postDataComplianceDeletionEvents202ApplicationJSONObject) {
        this.postDataComplianceDeletionEvents202ApplicationJSONObject = postDataComplianceDeletionEvents202ApplicationJSONObject;
        return this;
    }
    
}
