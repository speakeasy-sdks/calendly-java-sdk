package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GoogleConferenceTypeEnum {
    GOOGLE_CONFERENCE("google_conference");

    @JsonValue
    public final String value;

    private GoogleConferenceTypeEnum(String value) {
        this.value = value;
    }
}
