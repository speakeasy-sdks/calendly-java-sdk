package calendly.calendly.models.shared;

import calendly.calendly.utils.DateTimeDeserializer;
import calendly.calendly.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * WebhookSubscription
 * Webhook Subscription Object
**/
public class WebhookSubscription {
    @JsonProperty("callback_url")
    public String callbackUrl;
    public WebhookSubscription withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public WebhookSubscription withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("creator")
    public String creator;
    public WebhookSubscription withCreator(String creator) {
        this.creator = creator;
        return this;
    }
    
    @JsonProperty("events")
    public WebhookSubscriptionEventsEnum[] events;
    public WebhookSubscription withEvents(WebhookSubscriptionEventsEnum[] events) {
        this.events = events;
        return this;
    }
    
    @JsonProperty("organization")
    public String organization;
    public WebhookSubscription withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("retry_started_at")
    public OffsetDateTime retryStartedAt;
    public WebhookSubscription withRetryStartedAt(OffsetDateTime retryStartedAt) {
        this.retryStartedAt = retryStartedAt;
        return this;
    }
    
    @JsonProperty("scope")
    public WebhookSubscriptionScopeEnum scope;
    public WebhookSubscription withScope(WebhookSubscriptionScopeEnum scope) {
        this.scope = scope;
        return this;
    }
    
    @JsonProperty("state")
    public WebhookSubscriptionStateEnum state;
    public WebhookSubscription withState(WebhookSubscriptionStateEnum state) {
        this.state = state;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public WebhookSubscription withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("uri")
    public String uri;
    public WebhookSubscription withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
    @JsonProperty("user")
    public String user;
    public WebhookSubscription withUser(String user) {
        this.user = user;
        return this;
    }
    
}
