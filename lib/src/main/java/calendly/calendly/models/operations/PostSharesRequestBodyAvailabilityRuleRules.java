package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class PostSharesRequestBodyAvailabilityRuleRules {
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("date")
    public LocalDate date;
    public PostSharesRequestBodyAvailabilityRuleRules withDate(LocalDate date) {
        this.date = date;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("intervals")
    public PostSharesRequestBodyAvailabilityRuleRulesIntervals[] intervals;
    public PostSharesRequestBodyAvailabilityRuleRules withIntervals(PostSharesRequestBodyAvailabilityRuleRulesIntervals[] intervals) {
        this.intervals = intervals;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public PostSharesRequestBodyAvailabilityRuleRulesTypeEnum type;
    public PostSharesRequestBodyAvailabilityRuleRules withType(PostSharesRequestBodyAvailabilityRuleRulesTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wday")
    public PostSharesRequestBodyAvailabilityRuleRulesWdayEnum wday;
    public PostSharesRequestBodyAvailabilityRuleRules withWday(PostSharesRequestBodyAvailabilityRuleRulesWdayEnum wday) {
        this.wday = wday;
        return this;
    }
    
}
