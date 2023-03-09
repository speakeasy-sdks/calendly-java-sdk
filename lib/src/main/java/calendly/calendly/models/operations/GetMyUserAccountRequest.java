package calendly.calendly.models.operations;



public class GetMyUserAccountRequest {
    public GetMyUserAccountSecurity security;
    public GetMyUserAccountRequest withSecurity(GetMyUserAccountSecurity security) {
        this.security = security;
        return this;
    }
    
}
