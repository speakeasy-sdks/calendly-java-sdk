package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostOrganizationsUuidInvitationsRequestBody {
    @JsonProperty("email")
    public String email;
    public PostOrganizationsUuidInvitationsRequestBody withEmail(String email) {
        this.email = email;
        return this;
    }
    
}
