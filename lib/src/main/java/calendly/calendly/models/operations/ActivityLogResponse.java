package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class ActivityLogResponse {
    public String contentType;
    public ActivityLogResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public ActivityLogErrorResponse errorResponse;
    public ActivityLogResponse withErrorResponse(ActivityLogErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public ActivityLogResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ActivityLogResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ActivityLog200ApplicationJSON activityLog200ApplicationJSONObject;
    public ActivityLogResponse withActivityLog200ApplicationJSONObject(ActivityLog200ApplicationJSON activityLog200ApplicationJSONObject) {
        this.activityLog200ApplicationJSONObject = activityLog200ApplicationJSONObject;
        return this;
    }
    
    public ActivityLog403ApplicationJSON activityLog403ApplicationJSONObject;
    public ActivityLogResponse withActivityLog403ApplicationJSONObject(ActivityLog403ApplicationJSON activityLog403ApplicationJSONObject) {
        this.activityLog403ApplicationJSONObject = activityLog403ApplicationJSONObject;
        return this;
    }
    
}
