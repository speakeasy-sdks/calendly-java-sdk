package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EventTypeKindDescriptionEnum {
    COLLECTIVE("Collective"),
    GROUP("Group"),
    ONE_ON_ONE("One-on-One"),
    ROUND_ROBIN("Round Robin");

    @JsonValue
    public final String value;

    private EventTypeKindDescriptionEnum(String value) {
        this.value = value;
    }
}
