package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PostSharesRequestBodyPeriodTypeEnum {
    AVAILABLE_MOVING("available_moving"),
    MOVING("moving"),
    FIXED("fixed"),
    UNLIMITED("unlimited");

    @JsonValue
    public final String value;

    private PostSharesRequestBodyPeriodTypeEnum(String value) {
        this.value = value;
    }
}
