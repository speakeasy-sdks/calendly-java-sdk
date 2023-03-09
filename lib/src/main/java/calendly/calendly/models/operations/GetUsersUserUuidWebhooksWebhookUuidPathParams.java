package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetUsersUserUuidWebhooksWebhookUuidPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=webhook_uuid")
    public String webhookUuid;
    public GetUsersUserUuidWebhooksWebhookUuidPathParams withWebhookUuid(String webhookUuid) {
        this.webhookUuid = webhookUuid;
        return this;
    }
    
}
