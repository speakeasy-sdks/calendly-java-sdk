package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum EventTypeCustomQuestionTypeEnum {
    STRING("string"),
    TEXT("text"),
    PHONE_NUMBER("phone_number"),
    SINGLE_SELECT("single_select"),
    MULTI_SELECT("multi_select");

    @JsonValue
    public final String value;

    private EventTypeCustomQuestionTypeEnum(String value) {
        this.value = value;
    }
}
