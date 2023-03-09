package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EventTypeKindEnum {
    SOLO("solo"),
    GROUP("group");

    @JsonValue
    public final String value;

    private EventTypeKindEnum(String value) {
        this.value = value;
    }
}
