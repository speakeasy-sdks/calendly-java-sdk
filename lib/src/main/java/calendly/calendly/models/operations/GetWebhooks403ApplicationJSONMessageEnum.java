package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GetWebhooks403ApplicationJSONMessageEnum {
    YOU_DO_NOT_HAVE_PERMISSION("You do not have permission"),
    YOU_DO_NOT_HAVE_PERMISSION_TO_ACCESS_THIS_RESOURCE("You do not have permission to access this resource."),
    UNAUTHORIZED("Unauthorized");

    @JsonValue
    public final String value;

    private GetWebhooks403ApplicationJSONMessageEnum(String value) {
        this.value = value;
    }
}
