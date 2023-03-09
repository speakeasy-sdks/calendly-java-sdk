package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ShareShareOverridePeriodTypeEnum {
    AVAILABLE_MOVING("available_moving"),
    MOVING("moving"),
    FIXED("fixed"),
    UNLIMITED("unlimited");

    @JsonValue
    public final String value;

    private ShareShareOverridePeriodTypeEnum(String value) {
        this.value = value;
    }
}
