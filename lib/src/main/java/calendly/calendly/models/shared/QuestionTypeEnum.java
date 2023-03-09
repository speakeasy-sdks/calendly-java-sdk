package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum QuestionTypeEnum {
    NAME("name"),
    TEXT("text"),
    EMAIL("email"),
    PHONE("phone"),
    TEXTAREA("textarea"),
    SELECT("select"),
    RADIOS("radios");

    @JsonValue
    public final String value;

    private QuestionTypeEnum(String value) {
        this.value = value;
    }
}
