package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PostSharesRequestBodyAvailabilityRuleRulesTypeEnum {
    WDAY("wday"),
    DATE("date");

    @JsonValue
    public final String value;

    private PostSharesRequestBodyAvailabilityRuleRulesTypeEnum(String value) {
        this.value = value;
    }
}
