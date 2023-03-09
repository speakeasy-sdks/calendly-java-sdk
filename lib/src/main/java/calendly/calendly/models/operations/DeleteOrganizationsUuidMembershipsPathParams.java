package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class DeleteOrganizationsUuidMembershipsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public DeleteOrganizationsUuidMembershipsPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
