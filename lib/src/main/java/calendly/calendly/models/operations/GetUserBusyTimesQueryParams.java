package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetUserBusyTimesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=end_time")
    public String endTime;
    public GetUserBusyTimesQueryParams withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=start_time")
    public String startTime;
    public GetUserBusyTimesQueryParams withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user")
    public String user;
    public GetUserBusyTimesQueryParams withUser(String user) {
        this.user = user;
        return this;
    }
    
}
