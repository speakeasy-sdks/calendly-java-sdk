package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetRoutingFormSubmissionsResponse {
    public String contentType;
    public GetRoutingFormSubmissionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetRoutingFormSubmissionsErrorResponse errorResponse;
    public GetRoutingFormSubmissionsResponse withErrorResponse(GetRoutingFormSubmissionsErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetRoutingFormSubmissionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetRoutingFormSubmissionsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetRoutingFormSubmissions200ApplicationJSON getRoutingFormSubmissions200ApplicationJSONObject;
    public GetRoutingFormSubmissionsResponse withGetRoutingFormSubmissions200ApplicationJSONObject(GetRoutingFormSubmissions200ApplicationJSON getRoutingFormSubmissions200ApplicationJSONObject) {
        this.getRoutingFormSubmissions200ApplicationJSONObject = getRoutingFormSubmissions200ApplicationJSONObject;
        return this;
    }
    
}
