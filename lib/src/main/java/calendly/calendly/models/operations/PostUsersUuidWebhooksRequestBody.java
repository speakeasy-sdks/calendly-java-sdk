package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostUsersUuidWebhooksRequestBody {
    @JsonProperty("events")
    public PostUsersUuidWebhooksRequestBodyEventsEnum[] events;
    public PostUsersUuidWebhooksRequestBody withEvents(PostUsersUuidWebhooksRequestBodyEventsEnum[] events) {
        this.events = events;
        return this;
    }
    
    @JsonProperty("organization")
    public String organization;
    public PostUsersUuidWebhooksRequestBody withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @JsonProperty("scope")
    public PostUsersUuidWebhooksRequestBodyScopeEnum scope;
    public PostUsersUuidWebhooksRequestBody withScope(PostUsersUuidWebhooksRequestBodyScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("signing_key")
    public String signingKey;
    public PostUsersUuidWebhooksRequestBody withSigningKey(String signingKey) {
        this.signingKey = signingKey;
        return this;
    }
    
    @JsonProperty("url")
    public String url;
    public PostUsersUuidWebhooksRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user")
    public String user;
    public PostUsersUuidWebhooksRequestBody withUser(String user) {
        this.user = user;
        return this;
    }
    
}
