package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetEventTypesResponse {
    public String contentType;
    public GetEventTypesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetEventTypesErrorResponse errorResponse;
    public GetEventTypesResponse withErrorResponse(GetEventTypesErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetEventTypesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetEventTypesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetEventTypes200ApplicationJSON getEventTypes200ApplicationJSONObject;
    public GetEventTypesResponse withGetEventTypes200ApplicationJSONObject(GetEventTypes200ApplicationJSON getEventTypes200ApplicationJSONObject) {
        this.getEventTypes200ApplicationJSONObject = getEventTypes200ApplicationJSONObject;
        return this;
    }
    
    public GetEventTypes403ApplicationJSON getEventTypes403ApplicationJSONObject;
    public GetEventTypesResponse withGetEventTypes403ApplicationJSONObject(GetEventTypes403ApplicationJSON getEventTypes403ApplicationJSONObject) {
        this.getEventTypes403ApplicationJSONObject = getEventTypes403ApplicationJSONObject;
        return this;
    }
    
}
