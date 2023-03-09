package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostDataComplianceDeletionInviteesRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostDataComplianceDeletionInviteesRequestBody request;
    public PostDataComplianceDeletionInviteesRequest withRequest(PostDataComplianceDeletionInviteesRequestBody request) {
        this.request = request;
        return this;
    }
    
}
