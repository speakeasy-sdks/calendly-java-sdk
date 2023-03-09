package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetUserAvailabilitySchedulesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user")
    public String user;
    public GetUserAvailabilitySchedulesQueryParams withUser(String user) {
        this.user = user;
        return this;
    }
    
}
