package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetScheduledEventsUuidPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public GetScheduledEventsUuidPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
