package calendly.calendly.models.shared;

import calendly.calendly.utils.DateTimeDeserializer;
import calendly.calendly.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * Event
 * Information about a scheduled meeting
**/
public class Event {
    @JsonProperty("calendar_event")
    public LegacyCalendarEvent calendarEvent;
    public Event withCalendarEvent(LegacyCalendarEvent calendarEvent) {
        this.calendarEvent = calendarEvent;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cancellation")
    public Cancellation cancellation;
    public Event withCancellation(Cancellation cancellation) {
        this.cancellation = cancellation;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public Event withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("end_time")
    public OffsetDateTime endTime;
    public Event withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }
    
    @JsonProperty("event_guests")
    public Guest[] eventGuests;
    public Event withEventGuests(Guest[] eventGuests) {
        this.eventGuests = eventGuests;
        return this;
    }
    
    @JsonProperty("event_memberships")
    public EventEventMemberships[] eventMemberships;
    public Event withEventMemberships(EventEventMemberships[] eventMemberships) {
        this.eventMemberships = eventMemberships;
        return this;
    }
    
    @JsonProperty("event_type")
    public String eventType;
    public Event withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    
    @JsonProperty("invitees_counter")
    public EventInviteesCounter inviteesCounter;
    public Event withInviteesCounter(EventInviteesCounter inviteesCounter) {
        this.inviteesCounter = inviteesCounter;
        return this;
    }
    
    @JsonProperty("location")
    public Object location;
    public Event withLocation(Object location) {
        this.location = location;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public Event withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_time")
    public OffsetDateTime startTime;
    public Event withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
    
    @JsonProperty("status")
    public EventStatusEnum status;
    public Event withStatus(EventStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public Event withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("uri")
    public String uri;
    public Event withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
