package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum RoutingFormSubmissionSubmitterTypeEnum {
    INVITEE("Invitee");

    @JsonValue
    public final String value;

    private RoutingFormSubmissionSubmitterTypeEnum(String value) {
        this.value = value;
    }
}
