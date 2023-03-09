package calendly.calendly.models.operations;



public class GetUserAvailabilitySchedulesRequest {
    public GetUserAvailabilitySchedulesQueryParams queryParams;
    public GetUserAvailabilitySchedulesRequest withQueryParams(GetUserAvailabilitySchedulesQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public GetUserAvailabilitySchedulesSecurity security;
    public GetUserAvailabilitySchedulesRequest withSecurity(GetUserAvailabilitySchedulesSecurity security) {
        this.security = security;
        return this;
    }
    
}
