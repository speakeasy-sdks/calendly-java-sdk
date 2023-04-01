/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class PostSharesRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("availability_rule")
    public PostSharesRequestBodyAvailabilityRule availabilityRule;
    public PostSharesRequestBody withAvailabilityRule(PostSharesRequestBodyAvailabilityRule availabilityRule) {
        this.availabilityRule = availabilityRule;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Long duration;
    public PostSharesRequestBody withDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    
    /**
     * is required when `period_type` is 'fixed'
     * Format: `YYYY-MM-DD`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;
    public PostSharesRequestBody withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonProperty("event_type")
    public String eventType;
    public PostSharesRequestBody withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    
    /**
     * determines if a location is hidden until invitee books a spot, only respected when there is a single custom location configured
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hide_location")
    public Boolean hideLocation;
    public PostSharesRequestBody withHideLocation(Boolean hideLocation) {
        this.hideLocation = hideLocation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location_configurations")
    public PostSharesRequestBodyLocationConfigurations[] locationConfigurations;
    public PostSharesRequestBody withLocationConfigurations(PostSharesRequestBodyLocationConfigurations[] locationConfigurations) {
        this.locationConfigurations = locationConfigurations;
        return this;
    }
    
    /**
     * is required when `period_type` is 'moving' or 'available_moving'
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_booking_time")
    public Long maxBookingTime;
    public PostSharesRequestBody withMaxBookingTime(Long maxBookingTime) {
        this.maxBookingTime = maxBookingTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PostSharesRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("period_type")
    public PostSharesRequestBodyPeriodTypeEnum periodType;
    public PostSharesRequestBody withPeriodType(PostSharesRequestBodyPeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }
    
    /**
     * is required when `period_type` is 'fixed'
     * Format: `YYYY-MM-DD`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public PostSharesRequestBody withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
