/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetEventTypesUuid200ApplicationJSON - OK
 */
public class GetEventTypesUuid200ApplicationJSON {
    /**
     * A configuration for an Event
     */
    @JsonProperty("resource")public calendly.calendly.models.shared.EventType resource;
    public GetEventTypesUuid200ApplicationJSON withResource(calendly.calendly.models.shared.EventType resource) {
        this.resource = resource;
        return this;
    }
    
}
