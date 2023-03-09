package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RoutingFormStatusEnum {
    DRAFT("draft"),
    PUBLISHED("published");

    @JsonValue
    public final String value;

    private RoutingFormStatusEnum(String value) {
        this.value = value;
    }
}
