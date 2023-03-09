package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum WebExConferenceStatusEnum {
    INITIATED("initiated"),
    PROCESSING("processing"),
    PUSHED("pushed"),
    FAILED("failed");

    @JsonValue
    public final String value;

    private WebExConferenceStatusEnum(String value) {
        this.value = value;
    }
}
