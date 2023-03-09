package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ZoomConferenceStatusEnum {
    INITIATED("initiated"),
    PROCESSING("processing"),
    PUSHED("pushed"),
    FAILED("failed");

    @JsonValue
    public final String value;

    private ZoomConferenceStatusEnum(String value) {
        this.value = value;
    }
}
