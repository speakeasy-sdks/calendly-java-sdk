package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostInviteeNoShowRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostInviteeNoShowRequestBody request;
    public PostInviteeNoShowRequest withRequest(PostInviteeNoShowRequestBody request) {
        this.request = request;
        return this;
    }
    
    public PostInviteeNoShowSecurity security;
    public PostInviteeNoShowRequest withSecurity(PostInviteeNoShowSecurity security) {
        this.security = security;
        return this;
    }
    
}
