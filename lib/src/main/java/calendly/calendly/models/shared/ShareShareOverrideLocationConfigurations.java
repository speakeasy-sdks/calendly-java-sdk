package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ShareShareOverrideLocationConfigurations {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("additional_info")
    public String additionalInfo;
    public ShareShareOverrideLocationConfigurations withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("kind")
    public ShareShareOverrideLocationConfigurationsKindEnum kind;
    public ShareShareOverrideLocationConfigurations withKind(ShareShareOverrideLocationConfigurationsKindEnum kind) {
        this.kind = kind;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    public String location;
    public ShareShareOverrideLocationConfigurations withLocation(String location) {
        this.location = location;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_number")
    public String phoneNumber;
    public ShareShareOverrideLocationConfigurations withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("position")
    public Long position;
    public ShareShareOverrideLocationConfigurations withPosition(Long position) {
        this.position = position;
        return this;
    }
    
}
