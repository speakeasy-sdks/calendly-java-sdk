package calendly.calendly.models.operations;



public class GetOrganizationMembershipsRequest {
    public GetOrganizationMembershipsQueryParams queryParams;
    public GetOrganizationMembershipsRequest withQueryParams(GetOrganizationMembershipsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public GetOrganizationMembershipsSecurity security;
    public GetOrganizationMembershipsRequest withSecurity(GetOrganizationMembershipsSecurity security) {
        this.security = security;
        return this;
    }
    
}
