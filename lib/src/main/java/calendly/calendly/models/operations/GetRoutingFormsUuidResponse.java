/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetRoutingFormsUuidResponse {
    
    public String contentType;
    public GetRoutingFormsUuidResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Request is not valid
     */
    
    public GetRoutingFormsUuidErrorResponse errorResponse;
    public GetRoutingFormsUuidResponse withErrorResponse(GetRoutingFormsUuidErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public GetRoutingFormsUuidResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetRoutingFormsUuidResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public GetRoutingFormsUuid200ApplicationJSON getRoutingFormsUuid200ApplicationJSONObject;
    public GetRoutingFormsUuidResponse withGetRoutingFormsUuid200ApplicationJSONObject(GetRoutingFormsUuid200ApplicationJSON getRoutingFormsUuid200ApplicationJSONObject) {
        this.getRoutingFormsUuid200ApplicationJSONObject = getRoutingFormsUuid200ApplicationJSONObject;
        return this;
    }
    
}
