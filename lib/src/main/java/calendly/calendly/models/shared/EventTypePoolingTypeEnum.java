package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EventTypePoolingTypeEnum {
    ROUND_ROBIN("round_robin"),
    COLLECTIVE("collective");

    @JsonValue
    public final String value;

    private EventTypePoolingTypeEnum(String value) {
        this.value = value;
    }
}
