package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ShareSchedulingLinksOwnerTypeEnum {
    EVENT_TYPE("EventType");

    @JsonValue
    public final String value;

    private ShareSchedulingLinksOwnerTypeEnum(String value) {
        this.value = value;
    }
}
