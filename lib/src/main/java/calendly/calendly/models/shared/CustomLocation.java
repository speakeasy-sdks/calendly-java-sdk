package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomLocation
 * Use this to describe an existing Calendly-supported event location.
**/
public class CustomLocation {
    @JsonProperty("location")
    public String location;
    public CustomLocation withLocation(String location) {
        this.location = location;
        return this;
    }
    
    @JsonProperty("type")
    public CustomLocationTypeEnum type;
    public CustomLocation withType(CustomLocationTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
