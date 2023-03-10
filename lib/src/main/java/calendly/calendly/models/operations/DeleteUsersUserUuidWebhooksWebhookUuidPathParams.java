package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class DeleteUsersUserUuidWebhooksWebhookUuidPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=webhook_uuid")
    public String webhookUuid;
    public DeleteUsersUserUuidWebhooksWebhookUuidPathParams withWebhookUuid(String webhookUuid) {
        this.webhookUuid = webhookUuid;
        return this;
    }
    
}
