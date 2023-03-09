package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PostSharesRequestBodyAvailabilityRuleRulesWdayEnum {
    SUNDAY("sunday"),
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday");

    @JsonValue
    public final String value;

    private PostSharesRequestBodyAvailabilityRuleRulesWdayEnum(String value) {
        this.value = value;
    }
}
