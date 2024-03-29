/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ProfileTypeEnum - Indicates if the profile belongs to a "user" (individual) or "team"
 */
public enum ProfileTypeEnum {
    USER("User"),
    TEAM("Team");

    @JsonValue
    public final String value;

    private ProfileTypeEnum(String value) {
        this.value = value;
    }
}
