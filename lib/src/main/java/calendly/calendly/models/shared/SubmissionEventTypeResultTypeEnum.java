package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SubmissionEventTypeResultTypeEnum {
    EVENT_TYPE("event_type");

    @JsonValue
    public final String value;

    private SubmissionEventTypeResultTypeEnum(String value) {
        this.value = value;
    }
}
