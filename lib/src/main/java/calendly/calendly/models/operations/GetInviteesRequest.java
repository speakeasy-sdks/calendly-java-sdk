/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetInviteesRequest {
    /**
     * The number of rows to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Double count;
    public GetInviteesRequest withCount(Double count) {
        this.count = count;
        return this;
    }
    
    /**
     * Indicates if the results should be filtered by email address
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=email")
    public String email;
    public GetInviteesRequest withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * The token to pass to get the next or previous portion of the collection
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_token")
    public String pageToken;
    public GetInviteesRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    /**
     * Order results by the **created_at** field and direction specified: ascending ("asc") or descending ("desc")
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;
    public GetInviteesRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    /**
     * Indicates if the invitee "canceled" or still "active"
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=status")
    public GetInviteesStatusEnum status;
    public GetInviteesRequest withStatus(GetInviteesStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=uuid")
    public String uuid;
    public GetInviteesRequest withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
