/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetEventTypesUuidErrorResponseDetails {
    @JsonProperty("message")
    public String message;
    public GetEventTypesUuidErrorResponseDetails withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parameter")
    public String parameter;
    public GetEventTypesUuidErrorResponseDetails withParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }
    
}
