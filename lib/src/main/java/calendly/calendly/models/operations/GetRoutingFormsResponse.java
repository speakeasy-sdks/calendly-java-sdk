package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetRoutingFormsResponse {
    public String contentType;
    public GetRoutingFormsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetRoutingFormsErrorResponse errorResponse;
    public GetRoutingFormsResponse withErrorResponse(GetRoutingFormsErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetRoutingFormsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetRoutingFormsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetRoutingForms200ApplicationJSON getRoutingForms200ApplicationJSONObject;
    public GetRoutingFormsResponse withGetRoutingForms200ApplicationJSONObject(GetRoutingForms200ApplicationJSON getRoutingForms200ApplicationJSONObject) {
        this.getRoutingForms200ApplicationJSONObject = getRoutingForms200ApplicationJSONObject;
        return this;
    }
    
}
