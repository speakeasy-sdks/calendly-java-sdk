package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSharesRequestBodyAvailabilityRuleRulesIntervals {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    public String from;
    public PostSharesRequestBodyAvailabilityRuleRulesIntervals withFrom(String from) {
        this.from = from;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("to")
    public String to;
    public PostSharesRequestBodyAvailabilityRuleRulesIntervals withTo(String to) {
        this.to = to;
        return this;
    }
    
}
