package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class DeleteUsersUserUuidWebhooksWebhookUuidSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=oauth2")
    public calendly.calendly.models.shared.SchemeOauth2 oauth2;
    public DeleteUsersUserUuidWebhooksWebhookUuidSecurity withOauth2(calendly.calendly.models.shared.SchemeOauth2 oauth2) {
        this.oauth2 = oauth2;
        return this;
    }
    
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer")
    public calendly.calendly.models.shared.SchemePersonalAccessToken personalAccessToken;
    public DeleteUsersUserUuidWebhooksWebhookUuidSecurity withPersonalAccessToken(calendly.calendly.models.shared.SchemePersonalAccessToken personalAccessToken) {
        this.personalAccessToken = personalAccessToken;
        return this;
    }
    
}
