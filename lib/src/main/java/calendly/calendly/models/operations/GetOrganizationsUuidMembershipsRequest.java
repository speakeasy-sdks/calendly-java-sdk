package calendly.calendly.models.operations;



public class GetOrganizationsUuidMembershipsRequest {
    public GetOrganizationsUuidMembershipsPathParams pathParams;
    public GetOrganizationsUuidMembershipsRequest withPathParams(GetOrganizationsUuidMembershipsPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public GetOrganizationsUuidMembershipsSecurity security;
    public GetOrganizationsUuidMembershipsRequest withSecurity(GetOrganizationsUuidMembershipsSecurity security) {
        this.security = security;
        return this;
    }
    
}
