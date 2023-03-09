package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum LegacyCalendarEventKindEnum {
    EXCHANGE("exchange"),
    GOOGLE("google"),
    ICLOUD("icloud"),
    OUTLOOK("outlook"),
    OUTLOOK_DESKTOP("outlook_desktop");

    @JsonValue
    public final String value;

    private LegacyCalendarEventKindEnum(String value) {
        this.value = value;
    }
}
