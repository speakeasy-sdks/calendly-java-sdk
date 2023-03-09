package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetInviteesResponse {
    public String contentType;
    public GetInviteesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetInviteesErrorResponse errorResponse;
    public GetInviteesResponse withErrorResponse(GetInviteesErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetInviteesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetInviteesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetInvitees200ApplicationJSON getInvitees200ApplicationJSONObject;
    public GetInviteesResponse withGetInvitees200ApplicationJSONObject(GetInvitees200ApplicationJSON getInvitees200ApplicationJSONObject) {
        this.getInvitees200ApplicationJSONObject = getInvitees200ApplicationJSONObject;
        return this;
    }
    
    public GetInvitees403ApplicationJSON getInvitees403ApplicationJSONObject;
    public GetInviteesResponse withGetInvitees403ApplicationJSONObject(GetInvitees403ApplicationJSON getInvitees403ApplicationJSONObject) {
        this.getInvitees403ApplicationJSONObject = getInvitees403ApplicationJSONObject;
        return this;
    }
    
}
