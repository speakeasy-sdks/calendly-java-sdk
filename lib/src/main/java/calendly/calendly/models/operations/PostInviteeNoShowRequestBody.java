package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostInviteeNoShowRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("invitee")
    public String invitee;
    public PostInviteeNoShowRequestBody withInvitee(String invitee) {
        this.invitee = invitee;
        return this;
    }
    
}
