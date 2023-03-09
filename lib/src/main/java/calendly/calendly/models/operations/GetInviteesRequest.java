package calendly.calendly.models.operations;



public class GetInviteesRequest {
    public GetInviteesPathParams pathParams;
    public GetInviteesRequest withPathParams(GetInviteesPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public GetInviteesQueryParams queryParams;
    public GetInviteesRequest withQueryParams(GetInviteesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public GetInviteesSecurity security;
    public GetInviteesRequest withSecurity(GetInviteesSecurity security) {
        this.security = security;
        return this;
    }
    
}
