package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum GetWebhooks403ApplicationJSONTitleEnum {
    PERMISSION_DENIED("Permission Denied");

    @JsonValue
    public final String value;

    private GetWebhooks403ApplicationJSONTitleEnum(String value) {
        this.value = value;
    }
}
