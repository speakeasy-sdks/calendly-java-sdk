package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MicrosoftTeamsConferenceDataAudioConferencing {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("conferenceId")
    public String conferenceId;
    public MicrosoftTeamsConferenceDataAudioConferencing withConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dialinUrl")
    public String dialinUrl;
    public MicrosoftTeamsConferenceDataAudioConferencing withDialinUrl(String dialinUrl) {
        this.dialinUrl = dialinUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tollNumber")
    public String tollNumber;
    public MicrosoftTeamsConferenceDataAudioConferencing withTollNumber(String tollNumber) {
        this.tollNumber = tollNumber;
        return this;
    }
    
}
