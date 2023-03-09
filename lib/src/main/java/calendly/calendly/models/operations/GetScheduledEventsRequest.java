package calendly.calendly.models.operations;



public class GetScheduledEventsRequest {
    public GetScheduledEventsQueryParams queryParams;
    public GetScheduledEventsRequest withQueryParams(GetScheduledEventsQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public GetScheduledEventsSecurity security;
    public GetScheduledEventsRequest withSecurity(GetScheduledEventsSecurity security) {
        this.security = security;
        return this;
    }
    
}
