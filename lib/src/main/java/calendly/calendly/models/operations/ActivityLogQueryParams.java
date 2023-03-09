package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;

public class ActivityLogQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=action")
    public String[] action;
    public ActivityLogQueryParams withAction(String[] action) {
        this.action = action;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=actor")
    public String[] actor;
    public ActivityLogQueryParams withActor(String[] actor) {
        this.actor = actor;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Long count;
    public ActivityLogQueryParams withCount(Long count) {
        this.count = count;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=max_occurred_at")
    public OffsetDateTime maxOccurredAt;
    public ActivityLogQueryParams withMaxOccurredAt(OffsetDateTime maxOccurredAt) {
        this.maxOccurredAt = maxOccurredAt;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=min_occurred_at")
    public OffsetDateTime minOccurredAt;
    public ActivityLogQueryParams withMinOccurredAt(OffsetDateTime minOccurredAt) {
        this.minOccurredAt = minOccurredAt;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=namespace")
    public String[] namespace;
    public ActivityLogQueryParams withNamespace(String[] namespace) {
        this.namespace = namespace;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=organization")
    public String organization;
    public ActivityLogQueryParams withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_token")
    public String pageToken;
    public ActivityLogQueryParams withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=search_term")
    public String searchTerm;
    public ActivityLogQueryParams withSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=sort")
    public ActivityLogSortEnum[] sort;
    public ActivityLogQueryParams withSort(ActivityLogSortEnum[] sort) {
        this.sort = sort;
        return this;
    }
    
}
