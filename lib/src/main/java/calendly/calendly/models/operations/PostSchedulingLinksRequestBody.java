package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSchedulingLinksRequestBody {
    @JsonProperty("max_event_count")
    public Double maxEventCount;
    public PostSchedulingLinksRequestBody withMaxEventCount(Double maxEventCount) {
        this.maxEventCount = maxEventCount;
        return this;
    }
    
    @JsonProperty("owner")
    public String owner;
    public PostSchedulingLinksRequestBody withOwner(String owner) {
        this.owner = owner;
        return this;
    }
    
    @JsonProperty("owner_type")
    public PostSchedulingLinksRequestBodyOwnerTypeEnum ownerType;
    public PostSchedulingLinksRequestBody withOwnerType(PostSchedulingLinksRequestBodyOwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    
}
