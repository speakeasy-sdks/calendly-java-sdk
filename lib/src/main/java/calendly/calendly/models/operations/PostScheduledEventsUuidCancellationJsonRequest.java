package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostScheduledEventsUuidCancellationJsonRequest {
    public PostScheduledEventsUuidCancellationPathParams pathParams;
    public PostScheduledEventsUuidCancellationJsonRequest withPathParams(PostScheduledEventsUuidCancellationPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostScheduledEventsUuidCancellationApplicationJSON request;
    public PostScheduledEventsUuidCancellationJsonRequest withRequest(PostScheduledEventsUuidCancellationApplicationJSON request) {
        this.request = request;
        return this;
    }
    
}
