package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GetWebhooksScopeEnum {
    ORGANIZATION("organization"),
    USER("user");

    @JsonValue
    public final String value;

    private GetWebhooksScopeEnum(String value) {
        this.value = value;
    }
}
