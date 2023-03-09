package calendly.calendly.models.operations;



public class GetInviteeNoShowRequest {
    public GetInviteeNoShowPathParams pathParams;
    public GetInviteeNoShowRequest withPathParams(GetInviteeNoShowPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public GetInviteeNoShowSecurity security;
    public GetInviteeNoShowRequest withSecurity(GetInviteeNoShowSecurity security) {
        this.security = security;
        return this;
    }
    
}
