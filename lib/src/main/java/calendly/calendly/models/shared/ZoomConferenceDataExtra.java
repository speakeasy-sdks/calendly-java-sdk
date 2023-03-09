package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ZoomConferenceDataExtra {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("intl_numbers_url")
    public String intlNumbersUrl;
    public ZoomConferenceDataExtra withIntlNumbersUrl(String intlNumbersUrl) {
        this.intlNumbersUrl = intlNumbersUrl;
        return this;
    }
    
}
