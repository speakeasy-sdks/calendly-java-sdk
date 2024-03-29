/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSchedulingLinksRequestBody {
    /**
     * The max number of events that can be scheduled using this scheduling link.
     */
    @JsonProperty("max_event_count")
    public PostSchedulingLinksRequestBodyMaxEventCountEnum maxEventCount;
    public PostSchedulingLinksRequestBody withMaxEventCount(PostSchedulingLinksRequestBodyMaxEventCountEnum maxEventCount) {
        this.maxEventCount = maxEventCount;
        return this;
    }
    
    /**
     * A link to the resource that owns this Scheduling Link (currently, this is always an Event Type)
     */
    @JsonProperty("owner")
    public String owner;
    public PostSchedulingLinksRequestBody withOwner(String owner) {
        this.owner = owner;
        return this;
    }
    
    /**
     * Resource type (currently, this is always EventType)
     */
    @JsonProperty("owner_type")
    public PostSchedulingLinksRequestBodyOwnerTypeEnum ownerType;
    public PostSchedulingLinksRequestBody withOwnerType(PostSchedulingLinksRequestBodyOwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    
}
