package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostUsersUuidWebhooks403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public PostUsersUuidWebhooks403ApplicationJSONMessageEnum message;
    public PostUsersUuidWebhooks403ApplicationJSON withMessage(PostUsersUuidWebhooks403ApplicationJSONMessageEnum message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public PostUsersUuidWebhooks403ApplicationJSONTitleEnum title;
    public PostUsersUuidWebhooks403ApplicationJSON withTitle(PostUsersUuidWebhooks403ApplicationJSONTitleEnum title) {
        this.title = title;
        return this;
    }
    
}
