package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostOrganizationsUuidInvitationsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public PostOrganizationsUuidInvitationsPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
