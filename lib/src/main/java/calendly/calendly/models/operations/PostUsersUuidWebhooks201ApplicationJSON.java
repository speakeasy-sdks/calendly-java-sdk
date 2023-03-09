package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostUsersUuidWebhooks201ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.WebhookSubscription resource;
    public PostUsersUuidWebhooks201ApplicationJSON withResource(calendly.calendly.models.shared.WebhookSubscription resource) {
        this.resource = resource;
        return this;
    }
    
}
