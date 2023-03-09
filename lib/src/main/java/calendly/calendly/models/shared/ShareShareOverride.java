package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class ShareShareOverride {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("availability_rule")
    public ShareShareOverrideAvailabilityRule availabilityRule;
    public ShareShareOverride withAvailabilityRule(ShareShareOverrideAvailabilityRule availabilityRule) {
        this.availabilityRule = availabilityRule;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Long duration;
    public ShareShareOverride withDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("end_date")
    public LocalDate endDate;
    public ShareShareOverride withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hide_location")
    public Boolean hideLocation;
    public ShareShareOverride withHideLocation(Boolean hideLocation) {
        this.hideLocation = hideLocation;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location_configurations")
    public ShareShareOverrideLocationConfigurations[] locationConfigurations;
    public ShareShareOverride withLocationConfigurations(ShareShareOverrideLocationConfigurations[] locationConfigurations) {
        this.locationConfigurations = locationConfigurations;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_booking_time")
    public Long maxBookingTime;
    public ShareShareOverride withMaxBookingTime(Long maxBookingTime) {
        this.maxBookingTime = maxBookingTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public ShareShareOverride withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("period_type")
    public ShareShareOverridePeriodTypeEnum periodType;
    public ShareShareOverride withPeriodType(ShareShareOverridePeriodTypeEnum periodType) {
        this.periodType = periodType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("start_date")
    public LocalDate startDate;
    public ShareShareOverride withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }
    
}
