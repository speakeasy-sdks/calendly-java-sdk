package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetEventTypeAvailableTimesSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=oauth2")
    public calendly.calendly.models.shared.SchemeOauth2 oauth2;
    public GetEventTypeAvailableTimesSecurity withOauth2(calendly.calendly.models.shared.SchemeOauth2 oauth2) {
        this.oauth2 = oauth2;
        return this;
    }
    
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer")
    public calendly.calendly.models.shared.SchemePersonalAccessToken personalAccessToken;
    public GetEventTypeAvailableTimesSecurity withPersonalAccessToken(calendly.calendly.models.shared.SchemePersonalAccessToken personalAccessToken) {
        this.personalAccessToken = personalAccessToken;
        return this;
    }
    
}
