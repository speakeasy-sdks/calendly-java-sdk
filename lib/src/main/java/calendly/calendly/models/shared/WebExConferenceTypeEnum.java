package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum WebExConferenceTypeEnum {
    WEBEX_CONFERENCE("webex_conference");

    @JsonValue
    public final String value;

    private WebExConferenceTypeEnum(String value) {
        this.value = value;
    }
}
