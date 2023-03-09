package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetOrganizationsUuidInvitationsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public GetOrganizationsUuidInvitationsPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
