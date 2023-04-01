/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSharesRequestBodyAvailabilityRule {
    /**
     * are required when an availability rule is provided
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rules")
    public PostSharesRequestBodyAvailabilityRuleRules[] rules;
    public PostSharesRequestBodyAvailabilityRule withRules(PostSharesRequestBodyAvailabilityRuleRules[] rules) {
        this.rules = rules;
        return this;
    }
    
    /**
     * is required when an availability rule is provided
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezone")
    public String timezone;
    public PostSharesRequestBodyAvailabilityRule withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
}
