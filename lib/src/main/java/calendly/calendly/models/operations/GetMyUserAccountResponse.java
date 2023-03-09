package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetMyUserAccountResponse {
    public String contentType;
    public GetMyUserAccountResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetMyUserAccountErrorResponse errorResponse;
    public GetMyUserAccountResponse withErrorResponse(GetMyUserAccountErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetMyUserAccountResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetMyUserAccountResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetMyUserAccount200ApplicationJSON getMyUserAccount200ApplicationJSONObject;
    public GetMyUserAccountResponse withGetMyUserAccount200ApplicationJSONObject(GetMyUserAccount200ApplicationJSON getMyUserAccount200ApplicationJSONObject) {
        this.getMyUserAccount200ApplicationJSONObject = getMyUserAccount200ApplicationJSONObject;
        return this;
    }
    
}
