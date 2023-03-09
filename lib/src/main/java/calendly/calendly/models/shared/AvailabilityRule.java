package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AvailabilityRule
 * The rules for an availability schedule.
**/
public class AvailabilityRule {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("date")
    public String date;
    public AvailabilityRule withDate(String date) {
        this.date = date;
        return this;
    }
    
    @JsonProperty("intervals")
    public AvailabilityRuleIntervals[] intervals;
    public AvailabilityRule withIntervals(AvailabilityRuleIntervals[] intervals) {
        this.intervals = intervals;
        return this;
    }
    
    @JsonProperty("type")
    public AvailabilityRuleTypeEnum type;
    public AvailabilityRule withType(AvailabilityRuleTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wday")
    public AvailabilityRuleWdayEnum wday;
    public AvailabilityRule withWday(AvailabilityRuleWdayEnum wday) {
        this.wday = wday;
        return this;
    }
    
}
