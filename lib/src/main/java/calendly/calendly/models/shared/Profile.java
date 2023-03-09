package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile
 * The publicly visible profile of a User or a Team that's associated with the Event Type (note: some Event Types don't have profiles)
**/
public class Profile {
    @JsonProperty("name")
    public String name;
    public Profile withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("owner")
    public String owner;
    public Profile withOwner(String owner) {
        this.owner = owner;
        return this;
    }
    
    @JsonProperty("type")
    public ProfileTypeEnum type;
    public Profile withType(ProfileTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
