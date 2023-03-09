package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SubmissionExternalUrlResultTypeEnum {
    EXTERNAL_URL("external_url");

    @JsonValue
    public final String value;

    private SubmissionExternalUrlResultTypeEnum(String value) {
        this.value = value;
    }
}
