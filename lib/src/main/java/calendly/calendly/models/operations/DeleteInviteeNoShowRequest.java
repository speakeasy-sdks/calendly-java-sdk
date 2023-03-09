package calendly.calendly.models.operations;



public class DeleteInviteeNoShowRequest {
    public DeleteInviteeNoShowPathParams pathParams;
    public DeleteInviteeNoShowRequest withPathParams(DeleteInviteeNoShowPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public DeleteInviteeNoShowSecurity security;
    public DeleteInviteeNoShowRequest withSecurity(DeleteInviteeNoShowSecurity security) {
        this.security = security;
        return this;
    }
    
}
