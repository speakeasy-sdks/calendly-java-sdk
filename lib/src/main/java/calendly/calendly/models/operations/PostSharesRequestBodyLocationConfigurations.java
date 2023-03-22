/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSharesRequestBodyLocationConfigurations {
    /**
     * is only supported when `kind` is 'physical' or 'inbound_call' 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("additional_info")public String additionalInfo;
    public PostSharesRequestBodyLocationConfigurations withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("kind")public PostSharesRequestBodyLocationConfigurationsKindEnum kind;
    public PostSharesRequestBodyLocationConfigurations withKind(PostSharesRequestBodyLocationConfigurationsKindEnum kind) {
        this.kind = kind;
        return this;
    }
    
    /**
     * is only supported when `kind` is 'physical', 'custom' or 'ask_invitee'
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")public String location;
    public PostSharesRequestBodyLocationConfigurations withLocation(String location) {
        this.location = location;
        return this;
    }
    
    /**
     * is required when `kind` is 'inbound_call'
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_number")public String phoneNumber;
    public PostSharesRequestBodyLocationConfigurations withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("position")public Long position;
    public PostSharesRequestBodyLocationConfigurations withPosition(Long position) {
        this.position = position;
        return this;
    }
    
}
