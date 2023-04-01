/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class DeleteInviteeNoShowResponse {
    
    public String contentType;
    public DeleteInviteeNoShowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Cannot authenticate caller
     */
    
    public DeleteInviteeNoShowErrorResponse errorResponse;
    public DeleteInviteeNoShowResponse withErrorResponse(DeleteInviteeNoShowErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    
    public Integer statusCode;
    public DeleteInviteeNoShowResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public DeleteInviteeNoShowResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
