package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GotoMeetingConferenceStatusEnum {
    INITIATED("initiated"),
    PROCESSING("processing"),
    PUSHED("pushed"),
    FAILED("failed");

    @JsonValue
    public final String value;

    private GotoMeetingConferenceStatusEnum(String value) {
        this.value = value;
    }
}
