/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UserBusyTimeTypeEnum - Indicates whether the scheduled event is internal or external
 */
public enum UserBusyTimeTypeEnum {
    CALENDLY("calendly"),
    EXTERNAL("external");

    @JsonValue
    public final String value;

    private UserBusyTimeTypeEnum(String value) {
        this.value = value;
    }
}
