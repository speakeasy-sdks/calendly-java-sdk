package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GetInviteesStatusEnum {
    ACTIVE("active"),
    CANCELED("canceled");

    @JsonValue
    public final String value;

    private GetInviteesStatusEnum(String value) {
        this.value = value;
    }
}
