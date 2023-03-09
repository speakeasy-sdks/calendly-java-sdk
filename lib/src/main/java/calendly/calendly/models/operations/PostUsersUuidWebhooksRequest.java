package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostUsersUuidWebhooksRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostUsersUuidWebhooksRequestBody request;
    public PostUsersUuidWebhooksRequest withRequest(PostUsersUuidWebhooksRequestBody request) {
        this.request = request;
        return this;
    }
    
    public PostUsersUuidWebhooksSecurity security;
    public PostUsersUuidWebhooksRequest withSecurity(PostUsersUuidWebhooksSecurity security) {
        this.security = security;
        return this;
    }
    
}
