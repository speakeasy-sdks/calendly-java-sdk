package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EventTypeBookingMethodEnum {
    INSTANT("instant"),
    POLL("poll");

    @JsonValue
    public final String value;

    private EventTypeBookingMethodEnum(String value) {
        this.value = value;
    }
}
