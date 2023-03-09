package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetInviteeNoShowPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public GetInviteeNoShowPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
