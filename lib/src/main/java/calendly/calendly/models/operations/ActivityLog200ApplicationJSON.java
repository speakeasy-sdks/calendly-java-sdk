package calendly.calendly.models.operations;

import calendly.calendly.utils.DateTimeDeserializer;
import calendly.calendly.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * ActivityLog200ApplicationJSON
 * Activity log response
**/
public class ActivityLog200ApplicationJSON {
    @JsonProperty("collection")
    public calendly.calendly.models.shared.Entry[] collection;
    public ActivityLog200ApplicationJSON withCollection(calendly.calendly.models.shared.Entry[] collection) {
        this.collection = collection;
        return this;
    }
    
    @JsonProperty("exceeds_max_total_count")
    public Boolean exceedsMaxTotalCount;
    public ActivityLog200ApplicationJSON withExceedsMaxTotalCount(Boolean exceedsMaxTotalCount) {
        this.exceedsMaxTotalCount = exceedsMaxTotalCount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("last_event_time")
    public OffsetDateTime lastEventTime;
    public ActivityLog200ApplicationJSON withLastEventTime(OffsetDateTime lastEventTime) {
        this.lastEventTime = lastEventTime;
        return this;
    }
    
    @JsonProperty("pagination")
    public calendly.calendly.models.shared.Pagination pagination;
    public ActivityLog200ApplicationJSON withPagination(calendly.calendly.models.shared.Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    
    @JsonProperty("total_count")
    public Long totalCount;
    public ActivityLog200ApplicationJSON withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    
}
