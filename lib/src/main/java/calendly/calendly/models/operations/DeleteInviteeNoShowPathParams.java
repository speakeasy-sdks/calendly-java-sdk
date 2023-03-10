package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class DeleteInviteeNoShowPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public DeleteInviteeNoShowPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
