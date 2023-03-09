package calendly.calendly.models.operations;



public class ActivityLogRequest {
    public ActivityLogQueryParams queryParams;
    public ActivityLogRequest withQueryParams(ActivityLogQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
}
