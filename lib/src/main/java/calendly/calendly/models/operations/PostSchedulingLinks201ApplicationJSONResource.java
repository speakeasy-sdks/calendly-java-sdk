/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSchedulingLinks201ApplicationJSONResource {
    /**
     * Scheduling link url
     */
    @JsonProperty("booking_url")
    public String bookingUrl;
    public PostSchedulingLinks201ApplicationJSONResource withBookingUrl(String bookingUrl) {
        this.bookingUrl = bookingUrl;
        return this;
    }
    
    /**
     * A link to the resource that owns this Scheduling Link (currently, this is always an Event Type)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owner")
    public String owner;
    public PostSchedulingLinks201ApplicationJSONResource withOwner(String owner) {
        this.owner = owner;
        return this;
    }
    
    /**
     * Resource type (currently, this is always EventType)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("owner_type")
    public PostSchedulingLinks201ApplicationJSONResourceOwnerTypeEnum ownerType;
    public PostSchedulingLinks201ApplicationJSONResource withOwnerType(PostSchedulingLinks201ApplicationJSONResourceOwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    
}
