/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {
    /**
     * The number of rows to return
     */
    @JsonProperty("count")
    public Double count;
    public Pagination withCount(Double count) {
        this.count = count;
        return this;
    }
    
    /**
     * URI to return the next page of an ordered list ("null" indicates no additional results are available)
     */
    @JsonProperty("next_page")
    public String nextPage;
    public Pagination withNextPage(String nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    
    /**
     * Token to return the next page of an ordered list ("null" indicates no additional results are available)
     */
    @JsonProperty("next_page_token")
    public String nextPageToken;
    public Pagination withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    
    /**
     * URI to return the previous page of an ordered list ("null" indicates no additional results are available)
     */
    @JsonProperty("previous_page")
    public String previousPage;
    public Pagination withPreviousPage(String previousPage) {
        this.previousPage = previousPage;
        return this;
    }
    
    /**
     * Token to return the previous page of an ordered list ("null" indicates no additional results are available)
     */
    @JsonProperty("previous_page_token")
    public String previousPageToken;
    public Pagination withPreviousPageToken(String previousPageToken) {
        this.previousPageToken = previousPageToken;
        return this;
    }
    
}
