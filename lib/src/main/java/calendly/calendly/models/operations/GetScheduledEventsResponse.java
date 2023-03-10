package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetScheduledEventsResponse {
    public String contentType;
    public GetScheduledEventsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetScheduledEventsErrorResponse errorResponse;
    public GetScheduledEventsResponse withErrorResponse(GetScheduledEventsErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetScheduledEventsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetScheduledEventsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetScheduledEvents200ApplicationJSON getScheduledEvents200ApplicationJSONObject;
    public GetScheduledEventsResponse withGetScheduledEvents200ApplicationJSONObject(GetScheduledEvents200ApplicationJSON getScheduledEvents200ApplicationJSONObject) {
        this.getScheduledEvents200ApplicationJSONObject = getScheduledEvents200ApplicationJSONObject;
        return this;
    }
    
    public GetScheduledEvents403ApplicationJSON getScheduledEvents403ApplicationJSONObject;
    public GetScheduledEventsResponse withGetScheduledEvents403ApplicationJSONObject(GetScheduledEvents403ApplicationJSON getScheduledEvents403ApplicationJSONObject) {
        this.getScheduledEvents403ApplicationJSONObject = getScheduledEvents403ApplicationJSONObject;
        return this;
    }
    
}
