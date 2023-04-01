/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetUserRequest {
    /**
     * User unique identifier, or the constant "me" to reference the caller
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public GetUserRequest withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
