package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetOrganizationMembershipsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Double count;
    public GetOrganizationMembershipsQueryParams withCount(Double count) {
        this.count = count;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=email")
    public String email;
    public GetOrganizationMembershipsQueryParams withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=organization")
    public String organization;
    public GetOrganizationMembershipsQueryParams withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_token")
    public String pageToken;
    public GetOrganizationMembershipsQueryParams withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user")
    public String user;
    public GetOrganizationMembershipsQueryParams withUser(String user) {
        this.user = user;
        return this;
    }
    
}
