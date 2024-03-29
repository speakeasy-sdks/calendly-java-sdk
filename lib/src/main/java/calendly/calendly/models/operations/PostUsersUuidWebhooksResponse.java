/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class PostUsersUuidWebhooksResponse {
    
    public String contentType;
    public PostUsersUuidWebhooksResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Request is not valid
     */
    
    public PostUsersUuidWebhooksErrorResponse errorResponse;
    public PostUsersUuidWebhooksResponse withErrorResponse(PostUsersUuidWebhooksErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public PostUsersUuidWebhooksResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public PostUsersUuidWebhooksResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Created
     */
    
    public PostUsersUuidWebhooks201ApplicationJSON postUsersUuidWebhooks201ApplicationJSONObject;
    public PostUsersUuidWebhooksResponse withPostUsersUuidWebhooks201ApplicationJSONObject(PostUsersUuidWebhooks201ApplicationJSON postUsersUuidWebhooks201ApplicationJSONObject) {
        this.postUsersUuidWebhooks201ApplicationJSONObject = postUsersUuidWebhooks201ApplicationJSONObject;
        return this;
    }
    
    /**
     * Permission Denied
     */
    
    public PostUsersUuidWebhooks403ApplicationJSON postUsersUuidWebhooks403ApplicationJSONObject;
    public PostUsersUuidWebhooksResponse withPostUsersUuidWebhooks403ApplicationJSONObject(PostUsersUuidWebhooks403ApplicationJSON postUsersUuidWebhooks403ApplicationJSONObject) {
        this.postUsersUuidWebhooks403ApplicationJSONObject = postUsersUuidWebhooks403ApplicationJSONObject;
        return this;
    }
    
}
