package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GotoMeetingConferenceData
 * The conference metadata supplied by GoToMeeting
**/
public class GotoMeetingConferenceData {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("conferenceCallInfo")
    public String conferenceCallInfo;
    public GotoMeetingConferenceData withConferenceCallInfo(String conferenceCallInfo) {
        this.conferenceCallInfo = conferenceCallInfo;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uniqueMeetingId")
    public Double uniqueMeetingId;
    public GotoMeetingConferenceData withUniqueMeetingId(Double uniqueMeetingId) {
        this.uniqueMeetingId = uniqueMeetingId;
        return this;
    }
    
}
