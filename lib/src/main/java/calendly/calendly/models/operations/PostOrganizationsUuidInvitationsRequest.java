package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostOrganizationsUuidInvitationsRequest {
    public PostOrganizationsUuidInvitationsPathParams pathParams;
    public PostOrganizationsUuidInvitationsRequest withPathParams(PostOrganizationsUuidInvitationsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostOrganizationsUuidInvitationsRequestBody request;
    public PostOrganizationsUuidInvitationsRequest withRequest(PostOrganizationsUuidInvitationsRequestBody request) {
        this.request = request;
        return this;
    }
    
    public PostOrganizationsUuidInvitationsSecurity security;
    public PostOrganizationsUuidInvitationsRequest withSecurity(PostOrganizationsUuidInvitationsSecurity security) {
        this.security = security;
        return this;
    }
    
}
