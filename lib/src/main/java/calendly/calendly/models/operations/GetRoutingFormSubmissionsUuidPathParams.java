package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetRoutingFormSubmissionsUuidPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public GetRoutingFormSubmissionsUuidPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
