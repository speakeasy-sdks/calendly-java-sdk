/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUserAvailabilitySchedules200ApplicationJSON - OK
 */
public class GetUserAvailabilitySchedules200ApplicationJSON {
    @JsonProperty("collection")
    public calendly.calendly.models.shared.AvailabilitySchedule[] collection;
    public GetUserAvailabilitySchedules200ApplicationJSON withCollection(calendly.calendly.models.shared.AvailabilitySchedule[] collection) {
        this.collection = collection;
        return this;
    }
    
}
