/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetUserAvailabilitySchedulesUuidPathParams {
    /**
     * The UUID of the availability schedule.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")public String uuid;
    public GetUserAvailabilitySchedulesUuidPathParams withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
