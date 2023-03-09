package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum WebhookSubscriptionEventsEnum {
    INVITEE_CREATED("invitee.created"),
    INVITEE_CANCELED("invitee.canceled"),
    ROUTING_FORM_SUBMISSION_CREATED("routing_form_submission.created");

    @JsonValue
    public final String value;

    private WebhookSubscriptionEventsEnum(String value) {
        this.value = value;
    }
}
