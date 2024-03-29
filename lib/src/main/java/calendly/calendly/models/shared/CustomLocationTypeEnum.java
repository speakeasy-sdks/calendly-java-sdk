/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CustomLocationTypeEnum - The event location doesn't fall into a standard category defined by the event host (publisher)
 */
public enum CustomLocationTypeEnum {
    CUSTOM("custom");

    @JsonValue
    public final String value;

    private CustomLocationTypeEnum(String value) {
        this.value = value;
    }
}
