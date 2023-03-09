package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ShareShareOverrideAvailabilityRuleRulesTypeEnum {
    WDAY("wday"),
    DATE("date");

    @JsonValue
    public final String value;

    private ShareShareOverrideAvailabilityRuleRulesTypeEnum(String value) {
        this.value = value;
    }
}
