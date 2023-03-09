package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetWebhooks200ApplicationJSON {
    @JsonProperty("collection")
    public calendly.calendly.models.shared.WebhookSubscription[] collection;
    public GetWebhooks200ApplicationJSON withCollection(calendly.calendly.models.shared.WebhookSubscription[] collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonProperty("pagination")
    public calendly.calendly.models.shared.Pagination pagination;
    public GetWebhooks200ApplicationJSON withPagination(calendly.calendly.models.shared.Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
}
