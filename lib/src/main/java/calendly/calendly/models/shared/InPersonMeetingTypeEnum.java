package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum InPersonMeetingTypeEnum {
    PHYSICAL("physical");

    @JsonValue
    public final String value;

    private InPersonMeetingTypeEnum(String value) {
        this.value = value;
    }
}
