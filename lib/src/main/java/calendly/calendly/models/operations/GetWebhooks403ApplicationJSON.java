package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetWebhooks403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public GetWebhooks403ApplicationJSONMessageEnum message;
    public GetWebhooks403ApplicationJSON withMessage(GetWebhooks403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public GetWebhooks403ApplicationJSONTitleEnum title;
    public GetWebhooks403ApplicationJSON withTitle(GetWebhooks403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
