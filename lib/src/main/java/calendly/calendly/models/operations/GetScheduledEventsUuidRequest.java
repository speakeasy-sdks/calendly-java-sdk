package calendly.calendly.models.operations;



public class GetScheduledEventsUuidRequest {
    public GetScheduledEventsUuidPathParams pathParams;
    public GetScheduledEventsUuidRequest withPathParams(GetScheduledEventsUuidPathParams pathParams) {
        this.pathParams = pathParams;
        return this;
    }
    
    public GetScheduledEventsUuidSecurity security;
    public GetScheduledEventsUuidRequest withSecurity(GetScheduledEventsUuidSecurity security) {
        this.security = security;
        return this;
    }
    
}
