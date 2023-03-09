package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetWebhooksQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Double count;
    public GetWebhooksQueryParams withCount(Double count) {
        this.count = count;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=organization")
    public String organization;
    public GetWebhooksQueryParams withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_token")
    public String pageToken;
    public GetWebhooksQueryParams withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=scope")
    public GetWebhooksScopeEnum scope;
    public GetWebhooksQueryParams withScope(GetWebhooksScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;
    public GetWebhooksQueryParams withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user")
    public String user;
    public GetWebhooksQueryParams withUser(String user) {
        this.user = user;
        return this;
    }
    
}
