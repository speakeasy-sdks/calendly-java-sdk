package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EventStatusEnum {
    ACTIVE("active"),
    CANCELED("canceled");

    @JsonValue
    public final String value;

    private EventStatusEnum(String value) {
        this.value = value;
    }
}
