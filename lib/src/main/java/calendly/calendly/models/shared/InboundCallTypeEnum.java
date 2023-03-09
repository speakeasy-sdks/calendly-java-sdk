package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum InboundCallTypeEnum {
    INBOUND_CALL("inbound_call");

    @JsonValue
    public final String value;

    private InboundCallTypeEnum(String value) {
        this.value = value;
    }
}
