package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {
    @JsonProperty("count")
    public Double count;
    public Pagination withCount(Double count) {
        this.count = count;
        return this;
    }
    
    @JsonProperty("next_page")
    public String nextPage;
    public Pagination withNextPage(String nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    
    @JsonProperty("next_page_token")
    public String nextPageToken;
    public Pagination withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    
    @JsonProperty("previous_page")
    public String previousPage;
    public Pagination withPreviousPage(String previousPage) {
        this.previousPage = previousPage;
        return this;
    }
    
    @JsonProperty("previous_page_token")
    public String previousPageToken;
    public Pagination withPreviousPageToken(String previousPageToken) {
        this.previousPageToken = previousPageToken;
        return this;
    }
    
}
