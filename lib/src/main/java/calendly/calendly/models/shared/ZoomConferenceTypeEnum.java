package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ZoomConferenceTypeEnum {
    ZOOM_CONFERENCE("zoom_conference");

    @JsonValue
    public final String value;

    private ZoomConferenceTypeEnum(String value) {
        this.value = value;
    }
}
