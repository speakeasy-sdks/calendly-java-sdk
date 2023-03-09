package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum AvailabilityRuleTypeEnum {
    WDAY("wday"),
    DATE("date");

    @JsonValue
    public final String value;

    private AvailabilityRuleTypeEnum(String value) {
        this.value = value;
    }
}
