package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventInviteesCounter {
    @JsonProperty("active")
    public Double active;
    public EventInviteesCounter withActive(Double active) {
        this.active = active;
        return this;
    }
    
    @JsonProperty("limit")
    public Double limit;
    public EventInviteesCounter withLimit(Double limit) {
        this.limit = limit;
        return this;
    }
    
    @JsonProperty("total")
    public Double total;
    public EventInviteesCounter withTotal(Double total) {
        this.total = total;
        return this;
    }
    
}
