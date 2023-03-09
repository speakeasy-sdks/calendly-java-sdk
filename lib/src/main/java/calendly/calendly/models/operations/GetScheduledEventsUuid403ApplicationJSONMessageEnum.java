package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GetScheduledEventsUuid403ApplicationJSONMessageEnum {
    YOU_ARE_NOT_ALLOWED_TO_VIEW_THIS_EVENT("You are not allowed to view this event");

    @JsonValue
    public final String value;

    private GetScheduledEventsUuid403ApplicationJSONMessageEnum(String value) {
        this.value = value;
    }
}
