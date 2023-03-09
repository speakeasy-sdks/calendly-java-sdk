package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ZoomConferenceDataSettings {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("global_dial_in_numbers")
    public ZoomConferenceDataSettingsGlobalDialInNumbers[] globalDialInNumbers;
    public ZoomConferenceDataSettings withGlobalDialInNumbers(ZoomConferenceDataSettingsGlobalDialInNumbers[] globalDialInNumbers) {
        this.globalDialInNumbers = globalDialInNumbers;
        return this;
    }
    
}
