package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class RevokeUsersOrganizationInvitationPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=org_uuid")
    public String orgUuid;
    public RevokeUsersOrganizationInvitationPathParams withOrgUuid(String orgUuid) {
        this.orgUuid = orgUuid;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public RevokeUsersOrganizationInvitationPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
