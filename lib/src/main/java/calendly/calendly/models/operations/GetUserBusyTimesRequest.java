package calendly.calendly.models.operations;



public class GetUserBusyTimesRequest {
    public GetUserBusyTimesQueryParams queryParams;
    public GetUserBusyTimesRequest withQueryParams(GetUserBusyTimesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public GetUserBusyTimesSecurity security;
    public GetUserBusyTimesRequest withSecurity(GetUserBusyTimesSecurity security) {
        this.security = security;
        return this;
    }
    
}
