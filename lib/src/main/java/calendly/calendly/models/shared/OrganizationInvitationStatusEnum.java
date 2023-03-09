package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum OrganizationInvitationStatusEnum {
    PENDING("pending"),
    ACCEPTED("accepted"),
    DECLINED("declined");

    @JsonValue
    public final String value;

    private OrganizationInvitationStatusEnum(String value) {
        this.value = value;
    }
}
