package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetEventTypesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=active")
    public Boolean active;
    public GetEventTypesQueryParams withActive(Boolean active) {
        this.active = active;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=admin_managed")
    public Boolean adminManaged;
    public GetEventTypesQueryParams withAdminManaged(Boolean adminManaged) {
        this.adminManaged = adminManaged;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Double count;
    public GetEventTypesQueryParams withCount(Double count) {
        this.count = count;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=organization")
    public String organization;
    public GetEventTypesQueryParams withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_token")
    public String pageToken;
    public GetEventTypesQueryParams withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;
    public GetEventTypesQueryParams withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user")
    public String user;
    public GetEventTypesQueryParams withUser(String user) {
        this.user = user;
        return this;
    }
    
}
