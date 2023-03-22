/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * EventTypeBookingMethodEnum - Indicates if the event type is for a poll or an instant booking
 */
public enum EventTypeBookingMethodEnum {
    INSTANT("instant"),
    POLL("poll");

    @JsonValue
    public final String value;

    private EventTypeBookingMethodEnum(String value) {
        this.value = value;
    }
}
