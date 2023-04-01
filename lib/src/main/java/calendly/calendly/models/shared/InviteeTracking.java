/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InviteeTracking - The UTM and Salesforce tracking parameters associated with an Invitee
 */
public class InviteeTracking {
    /**
     * The Salesforce record unique identifier
     */
    @JsonProperty("salesforce_uuid")
    public String salesforceUuid;
    public InviteeTracking withSalesforceUuid(String salesforceUuid) {
        this.salesforceUuid = salesforceUuid;
        return this;
    }
    
    /**
     * The UTM parameter used to track a campaign
     */
    @JsonProperty("utm_campaign")
    public String utmCampaign;
    public InviteeTracking withUtmCampaign(String utmCampaign) {
        this.utmCampaign = utmCampaign;
        return this;
    }
    
    /**
     * UTM content tracking parameter
     */
    @JsonProperty("utm_content")
    public String utmContent;
    public InviteeTracking withUtmContent(String utmContent) {
        this.utmContent = utmContent;
        return this;
    }
    
    /**
     * The UTM parameter that identifies the type of input (e.g. Cost Per Click (CPC), social media, affiliate or QR code)
     */
    @JsonProperty("utm_medium")
    public String utmMedium;
    public InviteeTracking withUtmMedium(String utmMedium) {
        this.utmMedium = utmMedium;
        return this;
    }
    
    /**
     * The UTM parameter that identifies the source (platform where the traffic originates)
     */
    @JsonProperty("utm_source")
    public String utmSource;
    public InviteeTracking withUtmSource(String utmSource) {
        this.utmSource = utmSource;
        return this;
    }
    
    /**
     * The UTM parameter used to track keywords
     */
    @JsonProperty("utm_term")
    public String utmTerm;
    public InviteeTracking withUtmTerm(String utmTerm) {
        this.utmTerm = utmTerm;
        return this;
    }
    
}
