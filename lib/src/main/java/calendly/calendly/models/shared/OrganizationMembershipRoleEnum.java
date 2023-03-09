package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum OrganizationMembershipRoleEnum {
    USER("user"),
    ADMIN("admin"),
    OWNER("owner");

    @JsonValue
    public final String value;

    private OrganizationMembershipRoleEnum(String value) {
        this.value = value;
    }
}
