package calendly.calendly.models.shared;

import calendly.calendly.utils.DateTimeDeserializer;
import calendly.calendly.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * EventType
 * A configuration for an Event
**/
public class EventType {
    @JsonProperty("active")
    public Boolean active;
    public EventType withActive(Boolean active) {
        this.active = active;
        return this;
    }
    
    @JsonProperty("admin_managed")
    public Boolean adminManaged;
    public EventType withAdminManaged(Boolean adminManaged) {
        this.adminManaged = adminManaged;
        return this;
    }
    
    @JsonProperty("booking_method")
    public EventTypeBookingMethodEnum bookingMethod;
    public EventType withBookingMethod(EventTypeBookingMethodEnum bookingMethod) {
        this.bookingMethod = bookingMethod;
        return this;
    }
    
    @JsonProperty("color")
    public String color;
    public EventType withColor(String color) {
        this.color = color;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public EventType withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("custom_questions")
    public EventTypeCustomQuestion[] customQuestions;
    public EventType withCustomQuestions(EventTypeCustomQuestion[] customQuestions) {
        this.customQuestions = customQuestions;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("deleted_at")
    public OffsetDateTime deletedAt;
    public EventType withDeletedAt(OffsetDateTime deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }
    
    @JsonProperty("description_html")
    public String descriptionHtml;
    public EventType withDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
        return this;
    }
    
    @JsonProperty("description_plain")
    public String descriptionPlain;
    public EventType withDescriptionPlain(String descriptionPlain) {
        this.descriptionPlain = descriptionPlain;
        return this;
    }
    
    @JsonProperty("duration")
    public Double duration;
    public EventType withDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonProperty("internal_note")
    public String internalNote;
    public EventType withInternalNote(String internalNote) {
        this.internalNote = internalNote;
        return this;
    }
    
    @JsonProperty("kind")
    public EventTypeKindEnum kind;
    public EventType withKind(EventTypeKindEnum kind) {
        this.kind = kind;
        return this;
    }
    
    @JsonProperty("kind_description")
    public EventTypeKindDescriptionEnum kindDescription;
    public EventType withKindDescription(EventTypeKindDescriptionEnum kindDescription) {
        this.kindDescription = kindDescription;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public EventType withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("pooling_type")
    public EventTypePoolingTypeEnum poolingType;
    public EventType withPoolingType(EventTypePoolingTypeEnum poolingType) {
        this.poolingType = poolingType;
        return this;
    }
    
    @JsonProperty("profile")
    public Profile profile;
    public EventType withProfile(Profile profile) {
        this.profile = profile;
        return this;
    }
    
    @JsonProperty("scheduling_url")
    public String schedulingUrl;
    public EventType withSchedulingUrl(String schedulingUrl) {
        this.schedulingUrl = schedulingUrl;
        return this;
    }
    
    @JsonProperty("secret")
    public Boolean secret;
    public EventType withSecret(Boolean secret) {
        this.secret = secret;
        return this;
    }
    
    @JsonProperty("slug")
    public String slug;
    public EventType withSlug(String slug) {
        this.slug = slug;
        return this;
    }
    
    @JsonProperty("type")
    public EventTypeTypeEnum type;
    public EventType withType(EventTypeTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public EventType withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("uri")
    public String uri;
    public EventType withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
