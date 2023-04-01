/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetUserAvailabilitySchedulesResponse {
    
    public String contentType;
    public GetUserAvailabilitySchedulesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Request is not valid
     */
    
    public GetUserAvailabilitySchedulesErrorResponse errorResponse;
    public GetUserAvailabilitySchedulesResponse withErrorResponse(GetUserAvailabilitySchedulesErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public GetUserAvailabilitySchedulesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetUserAvailabilitySchedulesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public GetUserAvailabilitySchedules200ApplicationJSON getUserAvailabilitySchedules200ApplicationJSONObject;
    public GetUserAvailabilitySchedulesResponse withGetUserAvailabilitySchedules200ApplicationJSONObject(GetUserAvailabilitySchedules200ApplicationJSON getUserAvailabilitySchedules200ApplicationJSONObject) {
        this.getUserAvailabilitySchedules200ApplicationJSONObject = getUserAvailabilitySchedules200ApplicationJSONObject;
        return this;
    }
    
    /**
     * Permission Denied
     */
    
    public GetUserAvailabilitySchedules403ApplicationJSON getUserAvailabilitySchedules403ApplicationJSONObject;
    public GetUserAvailabilitySchedulesResponse withGetUserAvailabilitySchedules403ApplicationJSONObject(GetUserAvailabilitySchedules403ApplicationJSON getUserAvailabilitySchedules403ApplicationJSONObject) {
        this.getUserAvailabilitySchedules403ApplicationJSONObject = getUserAvailabilitySchedules403ApplicationJSONObject;
        return this;
    }
    
}
