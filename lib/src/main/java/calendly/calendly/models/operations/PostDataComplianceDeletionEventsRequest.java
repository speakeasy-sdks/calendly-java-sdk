package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostDataComplianceDeletionEventsRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostDataComplianceDeletionEventsRequestBody request;
    public PostDataComplianceDeletionEventsRequest withRequest(PostDataComplianceDeletionEventsRequestBody request) {
        this.request = request;
        return this;
    }
    
    public PostDataComplianceDeletionEventsSecurity security;
    public PostDataComplianceDeletionEventsRequest withSecurity(PostDataComplianceDeletionEventsSecurity security) {
        this.security = security;
        return this;
    }
    
}
