/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetRoutingFormsRequest {
    /**
     * The number of rows to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    public Double count;
    public GetRoutingFormsRequest withCount(Double count) {
        this.count = count;
        return this;
    }
    
    /**
     * View organization routing forms associated with the organization's URI.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=organization")
    public String organization;
    public GetRoutingFormsRequest withOrganization(String organization) {
        this.organization = organization;
        return this;
    }
    
    /**
     * The token to pass to get the next or previous portion of the collection
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page_token")
    public String pageToken;
    public GetRoutingFormsRequest withPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    
    /**
     * Order results by the specified field and direction. Accepts comma-separated list of {field}:{direction} values. Supported fields are: created_at. Sort direction is specified as: asc, desc.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;
    public GetRoutingFormsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
}
