package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum WebhookSubscriptionStateEnum {
    ACTIVE("active"),
    DISABLED("disabled");

    @JsonValue
    public final String value;

    private WebhookSubscriptionStateEnum(String value) {
        this.value = value;
    }
}
