package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUsersUserUuidWebhooksWebhookUuid200ApplicationJSON {
    @JsonProperty("resource")
    public calendly.calendly.models.shared.WebhookSubscription resource;
    public GetUsersUserUuidWebhooksWebhookUuid200ApplicationJSON withResource(calendly.calendly.models.shared.WebhookSubscription resource) {
        this.resource = resource;
        return this;
    }
    
}
