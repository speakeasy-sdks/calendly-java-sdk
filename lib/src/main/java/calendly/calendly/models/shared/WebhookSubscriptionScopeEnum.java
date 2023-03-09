package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum WebhookSubscriptionScopeEnum {
    USER("user"),
    ORGANIZATION("organization");

    @JsonValue
    public final String value;

    private WebhookSubscriptionScopeEnum(String value) {
        this.value = value;
    }
}
