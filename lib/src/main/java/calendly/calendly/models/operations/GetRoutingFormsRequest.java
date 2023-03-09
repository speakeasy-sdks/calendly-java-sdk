package calendly.calendly.models.operations;



public class GetRoutingFormsRequest {
    public GetRoutingFormsQueryParams queryParams;
    public GetRoutingFormsRequest withQueryParams(GetRoutingFormsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public GetRoutingFormsSecurity security;
    public GetRoutingFormsRequest withSecurity(GetRoutingFormsSecurity security) {
        this.security = security;
        return this;
    }
    
}
