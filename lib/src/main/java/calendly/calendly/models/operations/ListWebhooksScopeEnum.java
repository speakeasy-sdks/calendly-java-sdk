/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ListWebhooksScopeEnum - Filter the list by organization or user
 */
public enum ListWebhooksScopeEnum {
    ORGANIZATION("organization"),
    USER("user");

    @JsonValue
    public final String value;

    private ListWebhooksScopeEnum(String value) {
        this.value = value;
    }
}
