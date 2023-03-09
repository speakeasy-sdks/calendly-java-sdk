package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ProfileTypeEnum {
    USER("User"),
    TEAM("Team");

    @JsonValue
    public final String value;

    private ProfileTypeEnum(String value) {
        this.value = value;
    }
}
