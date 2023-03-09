package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PostSchedulingLinks201ApplicationJSONResourceOwnerTypeEnum {
    EVENT_TYPE("EventType");

    @JsonValue
    public final String value;

    private PostSchedulingLinks201ApplicationJSONResourceOwnerTypeEnum(String value) {
        this.value = value;
    }
}
