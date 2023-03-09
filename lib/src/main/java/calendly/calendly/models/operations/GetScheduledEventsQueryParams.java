package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetScheduledEventsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Double count;
    public GetScheduledEventsQueryParams withCount(Double count) {
        this.count = count;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=invitee_email")
    public String inviteeEmail;
    public GetScheduledEventsQueryParams withInviteeEmail(String inviteeEmail) {
        this.inviteeEmail = inviteeEmail;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=max_start_time")
    public String maxStartTime;
    public GetScheduledEventsQueryParams withMaxStartTime(String maxStartTime) {
        this.maxStartTime = maxStartTime;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=min_start_time")
    public String minStartTime;
    public GetScheduledEventsQueryParams withMinStartTime(String minStartTime) {
        this.minStartTime = minStartTime;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=organization")
    public String organization;
    public GetScheduledEventsQueryParams withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_token")
    public String pageToken;
    public GetScheduledEventsQueryParams withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;
    public GetScheduledEventsQueryParams withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=status")
    public GetScheduledEventsStatusEnum status;
    public GetScheduledEventsQueryParams withStatus(GetScheduledEventsStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user")
    public String user;
    public GetScheduledEventsQueryParams withUser(String user) {
        this.user = user;
        return this;
    }
    
}
