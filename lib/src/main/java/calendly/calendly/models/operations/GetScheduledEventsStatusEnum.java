package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GetScheduledEventsStatusEnum {
    ACTIVE("active"),
    CANCELED("canceled");

    @JsonValue
    public final String value;

    private GetScheduledEventsStatusEnum(String value) {
        this.value = value;
    }
}
