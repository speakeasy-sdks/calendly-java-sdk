/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * RoutingFormSubmissionSubmitterTypeEnum - Type of the respondent resource that submitted the form and scheduled a meeting.
 */
public enum RoutingFormSubmissionSubmitterTypeEnum {
    INVITEE("Invitee"),
    NULL_("null");

    @JsonValue
    public final String value;

    private RoutingFormSubmissionSubmitterTypeEnum(String value) {
        this.value = value;
    }
}
