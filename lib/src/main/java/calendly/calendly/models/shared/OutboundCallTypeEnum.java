package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum OutboundCallTypeEnum {
    OUTBOUND_CALL("outbound_call");

    @JsonValue
    public final String value;

    private OutboundCallTypeEnum(String value) {
        this.value = value;
    }
}
