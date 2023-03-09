package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SubmissionCustomMessageResultTypeEnum {
    CUSTOM_MESSAGE("custom_message");

    @JsonValue
    public final String value;

    private SubmissionCustomMessageResultTypeEnum(String value) {
        this.value = value;
    }
}
