/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteUsersUserUuidWebhooksWebhookUuidErrorResponse - Error Object
 */
public class DeleteUsersUserUuidWebhooksWebhookUuidErrorResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("details")
    public DeleteUsersUserUuidWebhooksWebhookUuidErrorResponseDetails[] details;
    public DeleteUsersUserUuidWebhooksWebhookUuidErrorResponse withDetails(DeleteUsersUserUuidWebhooksWebhookUuidErrorResponseDetails[] details) {
        this.details = details;
        return this;
    }
    
    @JsonProperty("message")
    public String message;
    public DeleteUsersUserUuidWebhooksWebhookUuidErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("title")
    public String title;
    public DeleteUsersUserUuidWebhooksWebhookUuidErrorResponse withTitle(String title) {
        this.title = title;
        return this;
    }
    
}
