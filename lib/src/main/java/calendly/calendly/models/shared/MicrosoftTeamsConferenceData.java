/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MicrosoftTeamsConferenceData - The conference metadata supplied by Microsoft Teams
 */
public class MicrosoftTeamsConferenceData {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioConferencing")
    public MicrosoftTeamsConferenceDataAudioConferencing audioConferencing;
    public MicrosoftTeamsConferenceData withAudioConferencing(MicrosoftTeamsConferenceDataAudioConferencing audioConferencing) {
        this.audioConferencing = audioConferencing;
        return this;
    }
    
    /**
     * The conference ID provided by Microsoft Teams
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;
    public MicrosoftTeamsConferenceData withId(String id) {
        this.id = id;
        return this;
    }
    
}
