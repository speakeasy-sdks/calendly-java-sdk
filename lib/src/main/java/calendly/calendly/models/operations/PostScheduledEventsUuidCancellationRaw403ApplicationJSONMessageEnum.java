package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PostScheduledEventsUuidCancellationRaw403ApplicationJSONMessageEnum {
    YOU_ARE_NOT_ALLOWED_TO_CANCEL_THIS_EVENT("You are not allowed to cancel this event"),
    EVENT_IN_THE_PAST("Event in the past"),
    EVENT_IS_ALREADY_CANCELED("Event is already canceled");

    @JsonValue
    public final String value;

    private PostScheduledEventsUuidCancellationRaw403ApplicationJSONMessageEnum(String value) {
        this.value = value;
    }
}
