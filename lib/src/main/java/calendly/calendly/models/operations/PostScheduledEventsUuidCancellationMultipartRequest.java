package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostScheduledEventsUuidCancellationMultipartRequest {
    public PostScheduledEventsUuidCancellationPathParams pathParams;
    public PostScheduledEventsUuidCancellationMultipartRequest withPathParams(PostScheduledEventsUuidCancellationPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    public java.util.Map<String, Object> request;
    public PostScheduledEventsUuidCancellationMultipartRequest withRequest(java.util.Map<String, Object> request) {
        this.request = request;
        return this;
    }
    
}
