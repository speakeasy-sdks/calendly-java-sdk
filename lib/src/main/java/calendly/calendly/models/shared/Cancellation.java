/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cancellation - Provides data pertaining to the cancellation of the Event
 */
public class Cancellation {
    /**
     * Name of the person whom canceled
     */
    @JsonProperty("canceled_by")public String canceledBy;
    public Cancellation withCanceledBy(String canceledBy) {
        this.canceledBy = canceledBy;
        return this;
    }
    
    @JsonProperty("canceler_type")public CancellationCancelerTypeEnum cancelerType;
    public Cancellation withCancelerType(CancellationCancelerTypeEnum cancelerType) {
        this.cancelerType = cancelerType;
        return this;
    }
    
    /**
     * Reason that the cancellation occurred
     */
    @JsonProperty("reason")public String reason;
    public Cancellation withReason(String reason) {
        this.reason = reason;
        return this;
    }
    
}
