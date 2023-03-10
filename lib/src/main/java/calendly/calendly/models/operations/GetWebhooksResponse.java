package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetWebhooksResponse {
    public String contentType;
    public GetWebhooksResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetWebhooksErrorResponse errorResponse;
    public GetWebhooksResponse withErrorResponse(GetWebhooksErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetWebhooksResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetWebhooksResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetWebhooks200ApplicationJSON getWebhooks200ApplicationJSONObject;
    public GetWebhooksResponse withGetWebhooks200ApplicationJSONObject(GetWebhooks200ApplicationJSON getWebhooks200ApplicationJSONObject) {
        this.getWebhooks200ApplicationJSONObject = getWebhooks200ApplicationJSONObject;
        return this;
    }
    
    public GetWebhooks403ApplicationJSON getWebhooks403ApplicationJSONObject;
    public GetWebhooksResponse withGetWebhooks403ApplicationJSONObject(GetWebhooks403ApplicationJSON getWebhooks403ApplicationJSONObject) {
        this.getWebhooks403ApplicationJSONObject = getWebhooks403ApplicationJSONObject;
        return this;
    }
    
}
