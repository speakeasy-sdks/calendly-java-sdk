package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GetUserBusyTimes403ApplicationJSONTitleEnum {
    PERMISSION_DENIED("Permission Denied");

    @JsonValue
    public final String value;

    private GetUserBusyTimes403ApplicationJSONTitleEnum(String value) {
        this.value = value;
    }
}
