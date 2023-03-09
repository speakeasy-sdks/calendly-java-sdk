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
 * UserBusyTime
 * An internal or external scheduled event for a given user
**/
public class UserBusyTime {
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("buffered_end_time")
    public OffsetDateTime bufferedEndTime;
    public UserBusyTime withBufferedEndTime(OffsetDateTime bufferedEndTime) {
        this.bufferedEndTime = bufferedEndTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("buffered_start_time")
    public OffsetDateTime bufferedStartTime;
    public UserBusyTime withBufferedStartTime(OffsetDateTime bufferedStartTime) {
        this.bufferedStartTime = bufferedStartTime;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("end_time")
    public OffsetDateTime endTime;
    public UserBusyTime withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("event")
    public UserBusyTimeEvent event;
    public UserBusyTime withEvent(UserBusyTimeEvent event) {
        this.event = event;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_time")
    public OffsetDateTime startTime;
    public UserBusyTime withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }
    
    @JsonProperty("type")
    public UserBusyTimeTypeEnum type;
    public UserBusyTime withType(UserBusyTimeTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
