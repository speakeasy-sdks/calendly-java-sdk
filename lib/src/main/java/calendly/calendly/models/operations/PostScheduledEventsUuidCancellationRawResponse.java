/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class PostScheduledEventsUuidCancellationRawResponse {
    public String contentType;
    public PostScheduledEventsUuidCancellationRawResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Request is not valid
     */
    public PostScheduledEventsUuidCancellationRawErrorResponse errorResponse;
    public PostScheduledEventsUuidCancellationRawResponse withErrorResponse(PostScheduledEventsUuidCancellationRawErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public PostScheduledEventsUuidCancellationRawResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public PostScheduledEventsUuidCancellationRawResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Created
     */
    public PostScheduledEventsUuidCancellationRaw201ApplicationJSON postScheduledEventsUuidCancellationRaw201ApplicationJSONObject;
    public PostScheduledEventsUuidCancellationRawResponse withPostScheduledEventsUuidCancellationRaw201ApplicationJSONObject(PostScheduledEventsUuidCancellationRaw201ApplicationJSON postScheduledEventsUuidCancellationRaw201ApplicationJSONObject) {
        this.postScheduledEventsUuidCancellationRaw201ApplicationJSONObject = postScheduledEventsUuidCancellationRaw201ApplicationJSONObject;
        return this;
    }
    
    /**
     * Caller not authorized to perform this action
     */
    public PostScheduledEventsUuidCancellationRaw403ApplicationJSON postScheduledEventsUuidCancellationRaw403ApplicationJSONObject;
    public PostScheduledEventsUuidCancellationRawResponse withPostScheduledEventsUuidCancellationRaw403ApplicationJSONObject(PostScheduledEventsUuidCancellationRaw403ApplicationJSON postScheduledEventsUuidCancellationRaw403ApplicationJSONObject) {
        this.postScheduledEventsUuidCancellationRaw403ApplicationJSONObject = postScheduledEventsUuidCancellationRaw403ApplicationJSONObject;
        return this;
    }
    
}
