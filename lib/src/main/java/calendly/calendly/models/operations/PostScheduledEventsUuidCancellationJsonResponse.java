package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class PostScheduledEventsUuidCancellationJsonResponse {
    public String contentType;
    public PostScheduledEventsUuidCancellationJsonResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public PostScheduledEventsUuidCancellationJsonErrorResponse errorResponse;
    public PostScheduledEventsUuidCancellationJsonResponse withErrorResponse(PostScheduledEventsUuidCancellationJsonErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public PostScheduledEventsUuidCancellationJsonResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public PostScheduledEventsUuidCancellationJsonResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostScheduledEventsUuidCancellationJSON201ApplicationJSON postScheduledEventsUuidCancellationJSON201ApplicationJSONObject;
    public PostScheduledEventsUuidCancellationJsonResponse withPostScheduledEventsUuidCancellationJSON201ApplicationJSONObject(PostScheduledEventsUuidCancellationJSON201ApplicationJSON postScheduledEventsUuidCancellationJSON201ApplicationJSONObject) {
        this.postScheduledEventsUuidCancellationJSON201ApplicationJSONObject = postScheduledEventsUuidCancellationJSON201ApplicationJSONObject;
        return this;
    }
    
    public PostScheduledEventsUuidCancellationJSON403ApplicationJSON postScheduledEventsUuidCancellationJSON403ApplicationJSONObject;
    public PostScheduledEventsUuidCancellationJsonResponse withPostScheduledEventsUuidCancellationJSON403ApplicationJSONObject(PostScheduledEventsUuidCancellationJSON403ApplicationJSON postScheduledEventsUuidCancellationJSON403ApplicationJSONObject) {
        this.postScheduledEventsUuidCancellationJSON403ApplicationJSONObject = postScheduledEventsUuidCancellationJSON403ApplicationJSONObject;
        return this;
    }
    
}
