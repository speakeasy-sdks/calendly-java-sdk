package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetOrganizationsUuidInvitationsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Double count;
    public GetOrganizationsUuidInvitationsQueryParams withCount(Double count) {
        this.count = count;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=email")
    public String email;
    public GetOrganizationsUuidInvitationsQueryParams withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_token")
    public String pageToken;
    public GetOrganizationsUuidInvitationsQueryParams withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;
    public GetOrganizationsUuidInvitationsQueryParams withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=status")
    public GetOrganizationsUuidInvitationsStatusEnum status;
    public GetOrganizationsUuidInvitationsQueryParams withStatus(GetOrganizationsUuidInvitationsStatusEnum status) {
        this.status = status;
        return this;
    }
    
}
