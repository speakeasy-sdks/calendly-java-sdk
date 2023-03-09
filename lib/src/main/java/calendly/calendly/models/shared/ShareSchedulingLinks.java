package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ShareSchedulingLinks {
    @JsonProperty("booking_url")
    public String bookingUrl;
    public ShareSchedulingLinks withBookingUrl(String bookingUrl) {
        this.bookingUrl = bookingUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owner")
    public String owner;
    public ShareSchedulingLinks withOwner(String owner) {
        this.owner = owner;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owner_type")
    public ShareSchedulingLinksOwnerTypeEnum ownerType;
    public ShareSchedulingLinks withOwnerType(ShareSchedulingLinksOwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    
}
