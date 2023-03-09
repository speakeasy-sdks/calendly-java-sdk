package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum InviteePaymentProviderEnum {
    STRIPE("stripe"),
    PAYPAL("paypal");

    @JsonValue
    public final String value;

    private InviteePaymentProviderEnum(String value) {
        this.value = value;
    }
}
