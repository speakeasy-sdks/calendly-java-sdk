package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetRoutingFormSubmissionsUuidResponse {
    public String contentType;
    public GetRoutingFormSubmissionsUuidResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetRoutingFormSubmissionsUuidErrorResponse errorResponse;
    public GetRoutingFormSubmissionsUuidResponse withErrorResponse(GetRoutingFormSubmissionsUuidErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetRoutingFormSubmissionsUuidResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetRoutingFormSubmissionsUuidResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetRoutingFormSubmissionsUuid200ApplicationJSON getRoutingFormSubmissionsUuid200ApplicationJSONObject;
    public GetRoutingFormSubmissionsUuidResponse withGetRoutingFormSubmissionsUuid200ApplicationJSONObject(GetRoutingFormSubmissionsUuid200ApplicationJSON getRoutingFormSubmissionsUuid200ApplicationJSONObject) {
        this.getRoutingFormSubmissionsUuid200ApplicationJSONObject = getRoutingFormSubmissionsUuid200ApplicationJSONObject;
        return this;
    }
    
}
