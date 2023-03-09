package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostScheduledEventsUuidCancellationRawRequest {
    public PostScheduledEventsUuidCancellationPathParams pathParams;
    public PostScheduledEventsUuidCancellationRawRequest withPathParams(PostScheduledEventsUuidCancellationPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/xml")
    public byte[] request;
    public PostScheduledEventsUuidCancellationRawRequest withRequest(byte[] request) {
        this.request = request;
        return this;
    }
    
}
