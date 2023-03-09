package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GetScheduledEvents403ApplicationJSONMessageEnum {
    YOU_DO_NOT_HAVE_PERMISSION_TO_ACCESS_THIS_RESOURCE("You do not have permission to access this resource."),
    PLEASE_ALSO_SPECIFY_ORGANIZATION_WHEN_REQUESTING_EVENTS_FOR_A_USER_WITHIN_YOUR_ORGANIZATION("Please also specify organization when requesting events for a user within your organization."),
    THIS_USER_IS_NOT_IN_YOUR_ORGANIZATION("This user is not in your organization"),
    YOU_DO_NOT_HAVE_PERMISSION("You do not have permission");

    @JsonValue
    public final String value;

    private GetScheduledEvents403ApplicationJSONMessageEnum(String value) {
        this.value = value;
    }
}