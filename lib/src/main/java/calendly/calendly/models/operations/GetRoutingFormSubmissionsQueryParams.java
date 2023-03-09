package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetRoutingFormSubmissionsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Double count;
    public GetRoutingFormSubmissionsQueryParams withCount(Double count) {
        this.count = count;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=form")
    public String form;
    public GetRoutingFormSubmissionsQueryParams withForm(String form) {
        this.form = form;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_token")
    public String pageToken;
    public GetRoutingFormSubmissionsQueryParams withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;
    public GetRoutingFormSubmissionsQueryParams withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
}
