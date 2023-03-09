package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum PostSharesRequestBodyLocationConfigurationsKindEnum {
    PHYSICAL("physical"),
    ASK_INVITEE("ask_invitee"),
    CUSTOM("custom"),
    OUTBOUND_CALL("outbound_call"),
    INBOUND_CALL("inbound_call"),
    GOOGLE_CONFERENCE("google_conference"),
    GOTOMEETING_CONFERENCE("gotomeeting_conference"),
    MICROSOFT_TEAMS_CONFERENCE("microsoft_teams_conference"),
    WEBEX_CONFERENCE("webex_conference"),
    ZOOM_CONFERENCE("zoom_conference");

    @JsonValue
    public final String value;

    private PostSharesRequestBodyLocationConfigurationsKindEnum(String value) {
        this.value = value;
    }
}
