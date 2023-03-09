package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum CustomLocationTypeEnum {
    CUSTOM("custom");

    @JsonValue
    public final String value;

    private CustomLocationTypeEnum(String value) {
        this.value = value;
    }
}
