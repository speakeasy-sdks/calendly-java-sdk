package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EventTypeTypeEnum {
    STANDARD_EVENT_TYPE("StandardEventType"),
    ADHOC_EVENT_TYPE("AdhocEventType");

    @JsonValue
    public final String value;

    private EventTypeTypeEnum(String value) {
        this.value = value;
    }
}
