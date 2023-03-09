package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUserBusyTimes200ApplicationJSON
 * Service Response
**/
public class GetUserBusyTimes200ApplicationJSON {
    @JsonProperty("collection")
    public calendly.calendly.models.shared.UserBusyTime[] collection;
    public GetUserBusyTimes200ApplicationJSON withCollection(calendly.calendly.models.shared.UserBusyTime[] collection) {
        this.collection = collection;
        return this;
    }
    
}
