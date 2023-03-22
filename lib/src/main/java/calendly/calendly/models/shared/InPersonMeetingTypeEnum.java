/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * InPersonMeetingTypeEnum - Indicates that the event will be an in-person meeting.
 */
public enum InPersonMeetingTypeEnum {
    PHYSICAL("physical");

    @JsonValue
    public final String value;

    private InPersonMeetingTypeEnum(String value) {
        this.value = value;
    }
}
