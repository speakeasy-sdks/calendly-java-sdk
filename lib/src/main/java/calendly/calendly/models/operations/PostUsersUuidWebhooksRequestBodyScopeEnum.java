package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PostUsersUuidWebhooksRequestBodyScopeEnum {
    ORGANIZATION("organization"),
    USER("user");

    @JsonValue
    public final String value;

    private PostUsersUuidWebhooksRequestBodyScopeEnum(String value) {
        this.value = value;
    }
}
