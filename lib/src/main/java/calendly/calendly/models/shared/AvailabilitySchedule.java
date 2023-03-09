package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AvailabilitySchedule
 * The availability schedule set by the user.
**/
public class AvailabilitySchedule {
    @JsonProperty("default")
    public Boolean default_;
    public AvailabilitySchedule withDefault(Boolean default_) {
        this.default_ = default_;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public AvailabilitySchedule withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("rules")
    public AvailabilityRule[] rules;
    public AvailabilitySchedule withRules(AvailabilityRule[] rules) {
        this.rules = rules;
        return this;
    }
    
    @JsonProperty("timezone")
    public String timezone;
    public AvailabilitySchedule withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
    @JsonProperty("uri")
    public String uri;
    public AvailabilitySchedule withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
    @JsonProperty("user")
    public String user;
    public AvailabilitySchedule withUser(String user) {
        this.user = user;
        return this;
    }
    
}
