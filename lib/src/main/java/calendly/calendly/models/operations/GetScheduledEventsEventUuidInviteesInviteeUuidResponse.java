package calendly.calendly.models.operations;

import java.net.http.HttpResponse;

public class GetScheduledEventsEventUuidInviteesInviteeUuidResponse {
    public String contentType;
    public GetScheduledEventsEventUuidInviteesInviteeUuidResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public GetScheduledEventsEventUuidInviteesInviteeUuidErrorResponse errorResponse;
    public GetScheduledEventsEventUuidInviteesInviteeUuidResponse withErrorResponse(GetScheduledEventsEventUuidInviteesInviteeUuidErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    public calendly.calendly.models.shared.ErrorResponse errorResponse1;
    public GetScheduledEventsEventUuidInviteesInviteeUuidResponse withErrorResponse1(calendly.calendly.models.shared.ErrorResponse errorResponse1) {
        this.errorResponse1 = errorResponse1;
        return this;
    }
    
    public Integer statusCode;
    public GetScheduledEventsEventUuidInviteesInviteeUuidResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetScheduledEventsEventUuidInviteesInviteeUuidResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetScheduledEventsEventUuidInviteesInviteeUuid200ApplicationJSON getScheduledEventsEventUuidInviteesInviteeUuid200ApplicationJSONObject;
    public GetScheduledEventsEventUuidInviteesInviteeUuidResponse withGetScheduledEventsEventUuidInviteesInviteeUuid200ApplicationJSONObject(GetScheduledEventsEventUuidInviteesInviteeUuid200ApplicationJSON getScheduledEventsEventUuidInviteesInviteeUuid200ApplicationJSONObject) {
        this.getScheduledEventsEventUuidInviteesInviteeUuid200ApplicationJSONObject = getScheduledEventsEventUuidInviteesInviteeUuid200ApplicationJSONObject;
        return this;
    }
    
}
