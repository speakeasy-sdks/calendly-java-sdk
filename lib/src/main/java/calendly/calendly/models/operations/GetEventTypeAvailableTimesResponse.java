package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetEventTypeAvailableTimesResponse {
    public String contentType;
    public GetEventTypeAvailableTimesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetEventTypeAvailableTimesErrorResponse errorResponse;
    public GetEventTypeAvailableTimesResponse withErrorResponse(GetEventTypeAvailableTimesErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetEventTypeAvailableTimesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetEventTypeAvailableTimesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetEventTypeAvailableTimes200ApplicationJSON getEventTypeAvailableTimes200ApplicationJSONObject;
    public GetEventTypeAvailableTimesResponse withGetEventTypeAvailableTimes200ApplicationJSONObject(GetEventTypeAvailableTimes200ApplicationJSON getEventTypeAvailableTimes200ApplicationJSONObject) {
        this.getEventTypeAvailableTimes200ApplicationJSONObject = getEventTypeAvailableTimes200ApplicationJSONObject;
        return this;
    }
    
}
