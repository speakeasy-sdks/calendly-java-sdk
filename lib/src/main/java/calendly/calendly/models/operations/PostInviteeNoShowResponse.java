package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class PostInviteeNoShowResponse {
    public String contentType;
    public PostInviteeNoShowResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public PostInviteeNoShowErrorResponse errorResponse;
    public PostInviteeNoShowResponse withErrorResponse(PostInviteeNoShowErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public PostInviteeNoShowResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public PostInviteeNoShowResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostInviteeNoShow201ApplicationJSON postInviteeNoShow201ApplicationJSONObject;
    public PostInviteeNoShowResponse withPostInviteeNoShow201ApplicationJSONObject(PostInviteeNoShow201ApplicationJSON postInviteeNoShow201ApplicationJSONObject) {
        this.postInviteeNoShow201ApplicationJSONObject = postInviteeNoShow201ApplicationJSONObject;
        return this;
    }
    
}
