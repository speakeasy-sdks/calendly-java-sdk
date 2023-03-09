package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum UserBusyTimeTypeEnum {
    CALENDLY("calendly"),
    EXTERNAL("external");

    @JsonValue
    public final String value;

    private UserBusyTimeTypeEnum(String value) {
        this.value = value;
    }
}
