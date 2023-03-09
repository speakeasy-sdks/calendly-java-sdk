package calendly.calendly.models.operations;



public class GetEventTypesRequest {
    public GetEventTypesQueryParams queryParams;
    public GetEventTypesRequest withQueryParams(GetEventTypesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public GetEventTypesSecurity security;
    public GetEventTypesRequest withSecurity(GetEventTypesSecurity security) {
        this.security = security;
        return this;
    }
    
}
