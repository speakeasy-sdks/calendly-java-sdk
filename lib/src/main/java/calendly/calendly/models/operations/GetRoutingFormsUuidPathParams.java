package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetRoutingFormsUuidPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public GetRoutingFormsUuidPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
