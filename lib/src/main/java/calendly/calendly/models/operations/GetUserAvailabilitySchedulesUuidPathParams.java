package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetUserAvailabilitySchedulesUuidPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public GetUserAvailabilitySchedulesUuidPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
