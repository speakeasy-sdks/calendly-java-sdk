package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class PostSharesResponse {
    public String contentType;
    public PostSharesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public PostSharesErrorResponse errorResponse;
    public PostSharesResponse withErrorResponse(PostSharesErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public PostSharesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public PostSharesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostShares201ApplicationJSON postShares201ApplicationJSONObject;
    public PostSharesResponse withPostShares201ApplicationJSONObject(PostShares201ApplicationJSON postShares201ApplicationJSONObject) {
        this.postShares201ApplicationJSONObject = postShares201ApplicationJSONObject;
        return this;
    }
    
}
