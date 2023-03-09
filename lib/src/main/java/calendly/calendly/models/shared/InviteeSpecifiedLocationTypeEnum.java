package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum InviteeSpecifiedLocationTypeEnum {
    ASK_INVITEE("ask_invitee");

    @JsonValue
    public final String value;

    private InviteeSpecifiedLocationTypeEnum(String value) {
        this.value = value;
    }
}
