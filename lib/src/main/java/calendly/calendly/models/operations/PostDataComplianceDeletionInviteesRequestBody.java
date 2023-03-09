package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostDataComplianceDeletionInviteesRequestBody {
    @JsonProperty("emails")
    public String[] emails;
    public PostDataComplianceDeletionInviteesRequestBody withEmails(String[] emails) {
        this.emails = emails;
        return this;
    }
    
}
