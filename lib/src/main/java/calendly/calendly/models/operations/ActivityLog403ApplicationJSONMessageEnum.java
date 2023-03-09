package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ActivityLog403ApplicationJSONMessageEnum {
    PLEASE_UPGRADE_YOUR_CALENDLY_ACCOUNT_TO_ENTERPRISE("Please upgrade your Calendly account to Enterprise."),
    YOU_DO_NOT_HAVE_PERMISSION_TO_ACCESS_THIS_RESOURCE("You do not have permission to access this resource.");

    @JsonValue
    public final String value;

    private ActivityLog403ApplicationJSONMessageEnum(String value) {
        this.value = value;
    }
}
