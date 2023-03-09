package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GotoMeetingConferenceTypeEnum {
    GOTOMEETING("gotomeeting");

    @JsonValue
    public final String value;

    private GotoMeetingConferenceTypeEnum(String value) {
        this.value = value;
    }
}
