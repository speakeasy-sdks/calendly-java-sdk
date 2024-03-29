/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ListScheduledEventsStatusEnum - Whether the scheduled event is `active` or `canceled`
 */
public enum ListScheduledEventsStatusEnum {
    ACTIVE("active"),
    CANCELED("canceled");

    @JsonValue
    public final String value;

    private ListScheduledEventsStatusEnum(String value) {
        this.value = value;
    }
}
