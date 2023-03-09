package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum InviteeStatusEnum {
    ACTIVE("active"),
    CANCELED("canceled");

    @JsonValue
    public final String value;

    private InviteeStatusEnum(String value) {
        this.value = value;
    }
}
