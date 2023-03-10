package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostSchedulingLinksRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostSchedulingLinksRequestBody request;
    public PostSchedulingLinksRequest withRequest(PostSchedulingLinksRequestBody request) {
        this.request = request;
        return this;
    }
    
}
