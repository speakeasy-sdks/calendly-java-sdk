package calendly.calendly.models.operations;



public class GetWebhooksRequest {
    public GetWebhooksQueryParams queryParams;
    public GetWebhooksRequest withQueryParams(GetWebhooksQueryParams queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    
    public GetWebhooksSecurity security;
    public GetWebhooksRequest withSecurity(GetWebhooksSecurity security) {
        this.security = security;
        return this;
    }
    
}
