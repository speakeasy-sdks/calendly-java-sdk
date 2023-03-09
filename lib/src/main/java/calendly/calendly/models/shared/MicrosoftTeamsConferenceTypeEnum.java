package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum MicrosoftTeamsConferenceTypeEnum {
    MICROSOFT_TEAMS_CONFERENCE("microsoft_teams_conference");

    @JsonValue
    public final String value;

    private MicrosoftTeamsConferenceTypeEnum(String value) {
        this.value = value;
    }
}
