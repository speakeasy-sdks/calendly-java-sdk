package calendly.calendly.models.operations;



public class GetRoutingFormSubmissionsRequest {
    public GetRoutingFormSubmissionsQueryParams queryParams;
    public GetRoutingFormSubmissionsRequest withQueryParams(GetRoutingFormSubmissionsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public GetRoutingFormSubmissionsSecurity security;
    public GetRoutingFormSubmissionsRequest withSecurity(GetRoutingFormSubmissionsSecurity security) {
        this.security = security;
        return this;
    }
    
}
