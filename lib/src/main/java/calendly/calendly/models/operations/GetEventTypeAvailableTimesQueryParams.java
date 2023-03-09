package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetEventTypeAvailableTimesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=end_time")
    public String endTime;
    public GetEventTypeAvailableTimesQueryParams withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=event_type")
    public String eventType;
    public GetEventTypeAvailableTimesQueryParams withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=start_time")
    public String startTime;
    public GetEventTypeAvailableTimesQueryParams withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    
}
