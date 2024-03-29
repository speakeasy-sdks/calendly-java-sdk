/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AvailabilityRuleTypeEnum - The type of this Availability Rule; can be "wday" or a specific "date".
 */
public enum AvailabilityRuleTypeEnum {
    WDAY("wday"),
    DATE("date");

    @JsonValue
    public final String value;

    private AvailabilityRuleTypeEnum(String value) {
        this.value = value;
    }
}
