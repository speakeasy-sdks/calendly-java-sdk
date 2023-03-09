package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSchedulingLinks201ApplicationJSONResource {
    @JsonProperty("booking_url")
    public String bookingUrl;
    public PostSchedulingLinks201ApplicationJSONResource withBookingUrl(String bookingUrl) {
        this.bookingUrl = bookingUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owner")
    public String owner;
    public PostSchedulingLinks201ApplicationJSONResource withOwner(String owner) {
        this.owner = owner;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owner_type")
    public PostSchedulingLinks201ApplicationJSONResourceOwnerTypeEnum ownerType;
    public PostSchedulingLinks201ApplicationJSONResource withOwnerType(PostSchedulingLinks201ApplicationJSONResourceOwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    
}
