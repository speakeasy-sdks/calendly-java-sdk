package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum InviteePaymentCurrencyEnum {
    AUD("AUD"),
    CAD("CAD"),
    EUR("EUR"),
    GBP("GBP"),
    USD("USD");

    @JsonValue
    public final String value;

    private InviteePaymentCurrencyEnum(String value) {
        this.value = value;
    }
}
