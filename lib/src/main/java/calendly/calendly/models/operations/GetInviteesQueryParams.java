package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetInviteesQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Double count;
    public GetInviteesQueryParams withCount(Double count) {
        this.count = count;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=email")
    public String email;
    public GetInviteesQueryParams withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_token")
    public String pageToken;
    public GetInviteesQueryParams withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;
    public GetInviteesQueryParams withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=status")
    public GetInviteesStatusEnum status;
    public GetInviteesQueryParams withStatus(GetInviteesStatusEnum status) {
        this.status = status;
        return this;
    }
    
}
