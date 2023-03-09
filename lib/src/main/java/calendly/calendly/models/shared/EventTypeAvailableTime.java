package calendly.calendly.models.shared;

import calendly.calendly.utils.DateTimeDeserializer;
import calendly.calendly.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * EventTypeAvailableTime
 * An available meeting time slot for the given event type
**/
public class EventTypeAvailableTime {
    @JsonProperty("invitees_remaining")
    public Double inviteesRemaining;
    public EventTypeAvailableTime withInviteesRemaining(Double inviteesRemaining) {
        this.inviteesRemaining = inviteesRemaining;
        return this;
    }
    
    @JsonProperty("scheduling_url")
    public String schedulingUrl;
    public EventTypeAvailableTime withSchedulingUrl(String schedulingUrl) {
        this.schedulingUrl = schedulingUrl;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_time")
    public OffsetDateTime startTime;
    public EventTypeAvailableTime withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
    
    @JsonProperty("status")
    public String status;
    public EventTypeAvailableTime withStatus(String status) {
        this.status = status;
        return this;
    }
    
}
