package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetOrganizationsUuidMembershipsPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public GetOrganizationsUuidMembershipsPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
