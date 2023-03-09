package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetUserPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public GetUserPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
