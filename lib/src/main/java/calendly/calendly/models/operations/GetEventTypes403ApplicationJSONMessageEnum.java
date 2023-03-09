package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GetEventTypes403ApplicationJSONMessageEnum {
    THIS_USER_IS_NOT_IN_YOUR_ORGANIZATION("This user is not in your organization"),
    YOU_DO_NOT_HAVE_PERMISSION("You do not have permission"),
    YOU_DO_NOT_HAVE_PERMISSION_TO_ACCESS_THIS_RESOURCE("You do not have permission to access this resource.");

    @JsonValue
    public final String value;

    private GetEventTypes403ApplicationJSONMessageEnum(String value) {
        this.value = value;
    }
}
