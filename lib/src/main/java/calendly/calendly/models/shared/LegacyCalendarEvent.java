package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LegacyCalendarEvent
 * Information about the calendar event from the calendar provider.
**/
public class LegacyCalendarEvent {
    @JsonProperty("external_id")
    public String externalId;
    public LegacyCalendarEvent withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    
    @JsonProperty("kind")
    public LegacyCalendarEventKindEnum kind;
    public LegacyCalendarEvent withKind(LegacyCalendarEventKindEnum kind) {
        this.kind = kind;
        return this;
    }
    
}
