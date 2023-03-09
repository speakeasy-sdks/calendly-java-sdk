package calendly.calendly.models.operations;



public class RevokeUsersOrganizationInvitationRequest {
    public RevokeUsersOrganizationInvitationPathParams pathParams;
    public RevokeUsersOrganizationInvitationRequest withPathParams(RevokeUsersOrganizationInvitationPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public RevokeUsersOrganizationInvitationSecurity security;
    public RevokeUsersOrganizationInvitationRequest withSecurity(RevokeUsersOrganizationInvitationSecurity security) {
        this.security = security;
        return this;
    }
    
}
