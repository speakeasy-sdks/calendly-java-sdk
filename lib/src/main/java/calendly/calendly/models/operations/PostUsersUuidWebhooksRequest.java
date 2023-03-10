package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostUsersUuidWebhooksRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostUsersUuidWebhooksRequestBody request;
    public PostUsersUuidWebhooksRequest withRequest(PostUsersUuidWebhooksRequestBody request) {
        this.request = request;
        return this;
    }
    
}
