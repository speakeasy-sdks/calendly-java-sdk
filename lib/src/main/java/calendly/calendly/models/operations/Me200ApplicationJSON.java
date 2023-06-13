/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Me200ApplicationJSON - Service response
 */
public class Me200ApplicationJSON {
    /**
     * Information about the user.
     */
    @JsonProperty("resource")
    public calendly.calendly.models.shared.User resource;
    public Me200ApplicationJSON withResource(calendly.calendly.models.shared.User resource) {
        this.resource = resource;
        return this;
    }
    
}