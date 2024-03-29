/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * EventTypeTypeEnum - Indicates if the event type is "AdhocEventType" (ad hoc event) or "StandardEventType" (standard event type)
 */
public enum EventTypeTypeEnum {
    STANDARD_EVENT_TYPE("StandardEventType"),
    ADHOC_EVENT_TYPE("AdhocEventType");

    @JsonValue
    public final String value;

    private EventTypeTypeEnum(String value) {
        this.value = value;
    }
}
