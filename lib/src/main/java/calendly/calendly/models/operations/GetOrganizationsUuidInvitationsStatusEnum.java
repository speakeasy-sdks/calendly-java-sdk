package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GetOrganizationsUuidInvitationsStatusEnum {
    PENDING("pending"),
    ACCEPTED("accepted"),
    DECLINED("declined");

    @JsonValue
    public final String value;

    private GetOrganizationsUuidInvitationsStatusEnum(String value) {
        this.value = value;
    }
}
