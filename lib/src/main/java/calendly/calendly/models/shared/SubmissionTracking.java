package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubmissionTracking
 * The UTM and Salesforce tracking parameters associated with a Routing Form Submission.
**/
public class SubmissionTracking {
    @JsonProperty("salesforce_uuid")
    public String salesforceUuid;
    public SubmissionTracking withSalesforceUuid(String salesforceUuid) {
        this.salesforceUuid = salesforceUuid;
        return this;
    }
    
    @JsonProperty("utm_campaign")
    public String utmCampaign;
    public SubmissionTracking withUtmCampaign(String utmCampaign) {
        this.utmCampaign = utmCampaign;
        return this;
    }
    
    @JsonProperty("utm_content")
    public String utmContent;
    public SubmissionTracking withUtmContent(String utmContent) {
        this.utmContent = utmContent;
        return this;
    }
    
    @JsonProperty("utm_medium")
    public String utmMedium;
    public SubmissionTracking withUtmMedium(String utmMedium) {
        this.utmMedium = utmMedium;
        return this;
    }
    
    @JsonProperty("utm_source")
    public String utmSource;
    public SubmissionTracking withUtmSource(String utmSource) {
        this.utmSource = utmSource;
        return this;
    }
    
    @JsonProperty("utm_term")
    public String utmTerm;
    public SubmissionTracking withUtmTerm(String utmTerm) {
        this.utmTerm = utmTerm;
        return this;
    }
    
}
