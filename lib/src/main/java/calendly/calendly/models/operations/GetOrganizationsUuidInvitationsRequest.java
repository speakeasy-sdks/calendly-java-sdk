package calendly.calendly.models.operations;



public class GetOrganizationsUuidInvitationsRequest {
    public GetOrganizationsUuidInvitationsPathParams pathParams;
    public GetOrganizationsUuidInvitationsRequest withPathParams(GetOrganizationsUuidInvitationsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public GetOrganizationsUuidInvitationsQueryParams queryParams;
    public GetOrganizationsUuidInvitationsRequest withQueryParams(GetOrganizationsUuidInvitationsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public GetOrganizationsUuidInvitationsSecurity security;
    public GetOrganizationsUuidInvitationsRequest withSecurity(GetOrganizationsUuidInvitationsSecurity security) {
        this.security = security;
        return this;
    }
    
}
