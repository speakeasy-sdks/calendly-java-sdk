package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetUserResponse {
    public String contentType;
    public GetUserResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetUserErrorResponse errorResponse;
    public GetUserResponse withErrorResponse(GetUserErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetUserResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetUserResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetUser200ApplicationJSON getUser200ApplicationJSONObject;
    public GetUserResponse withGetUser200ApplicationJSONObject(GetUser200ApplicationJSON getUser200ApplicationJSONObject) {
        this.getUser200ApplicationJSONObject = getUser200ApplicationJSONObject;
        return this;
    }
    
}