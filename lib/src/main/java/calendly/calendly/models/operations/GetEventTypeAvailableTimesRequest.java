package calendly.calendly.models.operations;



public class GetEventTypeAvailableTimesRequest {
    public GetEventTypeAvailableTimesQueryParams queryParams;
    public GetEventTypeAvailableTimesRequest withQueryParams(GetEventTypeAvailableTimesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public GetEventTypeAvailableTimesSecurity security;
    public GetEventTypeAvailableTimesRequest withSecurity(GetEventTypeAvailableTimesSecurity security) {
        this.security = security;
        return this;
    }
    
}
