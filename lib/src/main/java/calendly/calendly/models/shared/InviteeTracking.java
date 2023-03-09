package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InviteeTracking
 * The UTM and Salesforce tracking parameters associated with an Invitee
**/
public class InviteeTracking {
    @JsonProperty("salesforce_uuid")
    public String salesforceUuid;
    public InviteeTracking withSalesforceUuid(String salesforceUuid) {
        this.salesforceUuid = salesforceUuid;
        return this;
    }
    
    @JsonProperty("utm_campaign")
    public String utmCampaign;
    public InviteeTracking withUtmCampaign(String utmCampaign) {
        this.utmCampaign = utmCampaign;
        return this;
    }
    
    @JsonProperty("utm_content")
    public String utmContent;
    public InviteeTracking withUtmContent(String utmContent) {
        this.utmContent = utmContent;
        return this;
    }
    
    @JsonProperty("utm_medium")
    public String utmMedium;
    public InviteeTracking withUtmMedium(String utmMedium) {
        this.utmMedium = utmMedium;
        return this;
    }
    
    @JsonProperty("utm_source")
    public String utmSource;
    public InviteeTracking withUtmSource(String utmSource) {
        this.utmSource = utmSource;
        return this;
    }
    
    @JsonProperty("utm_term")
    public String utmTerm;
    public InviteeTracking withUtmTerm(String utmTerm) {
        this.utmTerm = utmTerm;
        return this;
    }
    
}
