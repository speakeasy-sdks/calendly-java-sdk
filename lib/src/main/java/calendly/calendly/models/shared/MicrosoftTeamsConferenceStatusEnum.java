package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum MicrosoftTeamsConferenceStatusEnum {
    INITIATED("initiated"),
    PROCESSING("processing"),
    PUSHED("pushed"),
    FAILED("failed");

    @JsonValue
    public final String value;

    private MicrosoftTeamsConferenceStatusEnum(String value) {
        this.value = value;
    }
}
