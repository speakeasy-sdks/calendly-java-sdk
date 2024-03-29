/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetEventTypesUuidResponse {
    
    public String contentType;
    public GetEventTypesUuidResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Request is not valid
     */
    
    public GetEventTypesUuidErrorResponse errorResponse;
    public GetEventTypesUuidResponse withErrorResponse(GetEventTypesUuidErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public GetEventTypesUuidResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetEventTypesUuidResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public GetEventTypesUuid200ApplicationJSON getEventTypesUuid200ApplicationJSONObject;
    public GetEventTypesUuidResponse withGetEventTypesUuid200ApplicationJSONObject(GetEventTypesUuid200ApplicationJSON getEventTypesUuid200ApplicationJSONObject) {
        this.getEventTypesUuid200ApplicationJSONObject = getEventTypesUuid200ApplicationJSONObject;
        return this;
    }
    
}
