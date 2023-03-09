package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class PostScheduledEventsUuidCancellationMultipartResponse {
    public String contentType;
    public PostScheduledEventsUuidCancellationMultipartResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public PostScheduledEventsUuidCancellationMultipartErrorResponse errorResponse;
    public PostScheduledEventsUuidCancellationMultipartResponse withErrorResponse(PostScheduledEventsUuidCancellationMultipartErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public PostScheduledEventsUuidCancellationMultipartResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public PostScheduledEventsUuidCancellationMultipartResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostScheduledEventsUuidCancellationMultipart201ApplicationJSON postScheduledEventsUuidCancellationMultipart201ApplicationJSONObject;
    public PostScheduledEventsUuidCancellationMultipartResponse withPostScheduledEventsUuidCancellationMultipart201ApplicationJSONObject(PostScheduledEventsUuidCancellationMultipart201ApplicationJSON postScheduledEventsUuidCancellationMultipart201ApplicationJSONObject) {
        this.postScheduledEventsUuidCancellationMultipart201ApplicationJSONObject = postScheduledEventsUuidCancellationMultipart201ApplicationJSONObject;
        return this;
    }
    
    public PostScheduledEventsUuidCancellationMultipart403ApplicationJSON postScheduledEventsUuidCancellationMultipart403ApplicationJSONObject;
    public PostScheduledEventsUuidCancellationMultipartResponse withPostScheduledEventsUuidCancellationMultipart403ApplicationJSONObject(PostScheduledEventsUuidCancellationMultipart403ApplicationJSON postScheduledEventsUuidCancellationMultipart403ApplicationJSONObject) {
        this.postScheduledEventsUuidCancellationMultipart403ApplicationJSONObject = postScheduledEventsUuidCancellationMultipart403ApplicationJSONObject;
        return this;
    }
    
}
