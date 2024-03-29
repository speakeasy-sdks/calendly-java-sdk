/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUsersUserUuidWebhooksWebhookUuidErrorResponse - Error Object
 */
public class GetUsersUserUuidWebhooksWebhookUuidErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public GetUsersUserUuidWebhooksWebhookUuidErrorResponseDetails[] details;
    public GetUsersUserUuidWebhooksWebhookUuidErrorResponse withDetails(GetUsersUserUuidWebhooksWebhookUuidErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public GetUsersUserUuidWebhooksWebhookUuidErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public GetUsersUserUuidWebhooksWebhookUuidErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
