package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetUserBusyTimesResponse {
    public String contentType;
    public GetUserBusyTimesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetUserBusyTimesErrorResponse errorResponse;
    public GetUserBusyTimesResponse withErrorResponse(GetUserBusyTimesErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public calendly.calendly.models.shared.ErrorResponse errorResponse1;
    public GetUserBusyTimesResponse withErrorResponse1(calendly.calendly.models.shared.ErrorResponse errorResponse1) {
        this.errorResponse1 = errorResponse1;
        return this;
    }
    
    public Integer statusCode;
    public GetUserBusyTimesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetUserBusyTimesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetUserBusyTimes200ApplicationJSON getUserBusyTimes200ApplicationJSONObject;
    public GetUserBusyTimesResponse withGetUserBusyTimes200ApplicationJSONObject(GetUserBusyTimes200ApplicationJSON getUserBusyTimes200ApplicationJSONObject) {
        this.getUserBusyTimes200ApplicationJSONObject = getUserBusyTimes200ApplicationJSONObject;
        return this;
    }
    
    public GetUserBusyTimes403ApplicationJSON getUserBusyTimes403ApplicationJSONObject;
    public GetUserBusyTimesResponse withGetUserBusyTimes403ApplicationJSONObject(GetUserBusyTimes403ApplicationJSON getUserBusyTimes403ApplicationJSONObject) {
        this.getUserBusyTimes403ApplicationJSONObject = getUserBusyTimes403ApplicationJSONObject;
        return this;
    }
    
}
