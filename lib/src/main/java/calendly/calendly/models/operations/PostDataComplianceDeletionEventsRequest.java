/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class PostDataComplianceDeletionEventsRequest {
    /**
     * The start and end times that delineate the time range for scheduled events data deletion.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")public PostDataComplianceDeletionEventsRequestBody request;
    public PostDataComplianceDeletionEventsRequest withRequest(PostDataComplianceDeletionEventsRequestBody request) {
        this.request = request;
        return this;
    }
    
}
