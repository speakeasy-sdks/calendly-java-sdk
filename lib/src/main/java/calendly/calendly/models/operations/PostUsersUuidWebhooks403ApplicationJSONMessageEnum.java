package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PostUsersUuidWebhooks403ApplicationJSONMessageEnum {
    PLEASE_UPGRADE_YOUR_CALENDLY_ACCOUNT_TO_PROFESSIONAL("Please upgrade your Calendly account to Professional"),
    YOU_DO_NOT_HAVE_PERMISSION_TO_ACCESS_THIS_RESOURCE("You do not have permission to access this resource."),
    YOU_DO_NOT_HAVE_PERMISSION("You do not have permission");

    @JsonValue
    public final String value;

    private PostUsersUuidWebhooks403ApplicationJSONMessageEnum(String value) {
        this.value = value;
    }
}
