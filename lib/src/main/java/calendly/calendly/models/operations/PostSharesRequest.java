package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostSharesRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostSharesRequestBody request;
    public PostSharesRequest withRequest(PostSharesRequestBody request) {
        this.request = request;
        return this;
    }
    
}
