package calendly.calendly.models.operations;



public class DeleteOrganizationsUuidMembershipsRequest {
    public DeleteOrganizationsUuidMembershipsPathParams pathParams;
    public DeleteOrganizationsUuidMembershipsRequest withPathParams(DeleteOrganizationsUuidMembershipsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public DeleteOrganizationsUuidMembershipsSecurity security;
    public DeleteOrganizationsUuidMembershipsRequest withSecurity(DeleteOrganizationsUuidMembershipsSecurity security) {
        this.security = security;
        return this;
    }
    
}
