package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InviteePayment
 * Invitee payment
**/
public class InviteePayment {
    @JsonProperty("amount")
    public Float amount;
    public InviteePayment withAmount(Float amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonProperty("currency")
    public InviteePaymentCurrencyEnum currency;
    public InviteePayment withCurrency(InviteePaymentCurrencyEnum currency) {
        this.currency = currency;
        return this;
    }
    
    @JsonProperty("external_id")
    public String externalId;
    public InviteePayment withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    
    @JsonProperty("provider")
    public InviteePaymentProviderEnum provider;
    public InviteePayment withProvider(InviteePaymentProviderEnum provider) {
        this.provider = provider;
        return this;
    }
    
    @JsonProperty("successful")
    public Boolean successful;
    public InviteePayment withSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    
    @JsonProperty("terms")
    public String terms;
    public InviteePayment withTerms(String terms) {
        this.terms = terms;
        return this;
    }
    
}
