package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetUsersUserUuidWebhooksWebhookUuidResponse {
    public String contentType;
    public GetUsersUserUuidWebhooksWebhookUuidResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetUsersUserUuidWebhooksWebhookUuidErrorResponse errorResponse;
    public GetUsersUserUuidWebhooksWebhookUuidResponse withErrorResponse(GetUsersUserUuidWebhooksWebhookUuidErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public Integer statusCode;
    public GetUsersUserUuidWebhooksWebhookUuidResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetUsersUserUuidWebhooksWebhookUuidResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetUsersUserUuidWebhooksWebhookUuid200ApplicationJSON getUsersUserUuidWebhooksWebhookUuid200ApplicationJSONObject;
    public GetUsersUserUuidWebhooksWebhookUuidResponse withGetUsersUserUuidWebhooksWebhookUuid200ApplicationJSONObject(GetUsersUserUuidWebhooksWebhookUuid200ApplicationJSON getUsersUserUuidWebhooksWebhookUuid200ApplicationJSONObject) {
        this.getUsersUserUuidWebhooksWebhookUuid200ApplicationJSONObject = getUsersUserUuidWebhooksWebhookUuid200ApplicationJSONObject;
        return this;
    }
    
}
