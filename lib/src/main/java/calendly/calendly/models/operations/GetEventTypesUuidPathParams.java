package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetEventTypesUuidPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public GetEventTypesUuidPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
