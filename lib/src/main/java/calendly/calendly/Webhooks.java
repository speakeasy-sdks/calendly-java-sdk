package calendly.calendly;

import calendly.calendly.utils.HTTPClient;
import calendly.calendly.utils.HTTPRequest;
import calendly.calendly.utils.JSON;
import calendly.calendly.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Webhooks {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Webhooks(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
    
    /**
     * deleteUsersUserUuidWebhooksWebhookUuid - Delete Webhook Subscription
     *
     * Delete a Webhook Subscription.
    **/
    public calendly.calendly.models.operations.DeleteUsersUserUuidWebhooksWebhookUuidResponse deleteUsersUserUuidWebhooksWebhookUuid(calendly.calendly.models.operations.DeleteUsersUserUuidWebhooksWebhookUuidRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(calendly.calendly.models.operations.DeleteUsersUserUuidWebhooksWebhookUuidPathParams.class, baseUrl, "/webhook_subscriptions/{webhook_uuid}", request.pathParams, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.DeleteUsersUserUuidWebhooksWebhookUuidResponse res = new calendly.calendly.models.operations.DeleteUsersUserUuidWebhooksWebhookUuidResponse() {{
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.DeleteUsersUserUuidWebhooksWebhookUuidErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.DeleteUsersUserUuidWebhooksWebhookUuidErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * getUsersUserUuidWebhooksWebhookUuid - Get Webhook Subscription
     *
     * Get a specified Webhook Subscription.
    **/
    public calendly.calendly.models.operations.GetUsersUserUuidWebhooksWebhookUuidResponse getUsersUserUuidWebhooksWebhookUuid(calendly.calendly.models.operations.GetUsersUserUuidWebhooksWebhookUuidRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(calendly.calendly.models.operations.GetUsersUserUuidWebhooksWebhookUuidPathParams.class, baseUrl, "/webhook_subscriptions/{webhook_uuid}", request.pathParams, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetUsersUserUuidWebhooksWebhookUuidResponse res = new calendly.calendly.models.operations.GetUsersUserUuidWebhooksWebhookUuidResponse() {{
            getUsersUserUuidWebhooksWebhookUuid200ApplicationJSONObject = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUsersUserUuidWebhooksWebhookUuid200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUsersUserUuidWebhooksWebhookUuid200ApplicationJSON.class);
                res.getUsersUserUuidWebhooksWebhookUuid200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUsersUserUuidWebhooksWebhookUuidErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUsersUserUuidWebhooksWebhookUuidErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * getWebhooks - List Webhook Subscriptions
     *
     * Get a list of Webhook Subscriptions for a specified Organization or User.
    **/
    public calendly.calendly.models.operations.GetWebhooksResponse getWebhooks(calendly.calendly.models.operations.GetWebhooksRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/webhook_subscriptions");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = calendly.calendly.utils.Utils.getQueryParams(calendly.calendly.models.operations.GetWebhooksQueryParams.class, request.queryParams, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetWebhooksResponse res = new calendly.calendly.models.operations.GetWebhooksResponse() {{
            getWebhooks200ApplicationJSONObject = null;
            errorResponse = null;
            getWebhooks403ApplicationJSONObject = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetWebhooks200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetWebhooks200ApplicationJSON.class);
                res.getWebhooks200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetWebhooksErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetWebhooksErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetWebhooks403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetWebhooks403ApplicationJSON.class);
                res.getWebhooks403ApplicationJSONObject = out;
            }
        }

        return res;
    }
	
    
    /**
     * postUsersUuidWebhooks - Create Webhook Subscription
     *
     * Create a Webhook Subscription for an Organization or User.
     * 
     * * The `organization` subscription scope triggers the webhook for all subscribed events within the organization.
     * * The `user` subscription scope only triggers the webhook for subscribed events that belong to the specific user.
     * 
     * | Event | Allowed Subscription Scopes |
     * | ----- | --------------------------- |
     * | <pre>invitee.created</pre> | `organization` `user` |
     * | <pre>invitee.canceled</pre> | `organization` `user` |
     * | <pre>routing_form_submission.created</pre> | `organization` <br /> <small>Create separate Webhook Subscriptions for events with different subscription scopes.</small> |
    **/
    public calendly.calendly.models.operations.PostUsersUuidWebhooksResponse postUsersUuidWebhooks(calendly.calendly.models.operations.PostUsersUuidWebhooksRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/webhook_subscriptions");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = calendly.calendly.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.PostUsersUuidWebhooksResponse res = new calendly.calendly.models.operations.PostUsersUuidWebhooksResponse() {{
            postUsersUuidWebhooks201ApplicationJSONObject = null;
            errorResponse = null;
            postUsersUuidWebhooks403ApplicationJSONObject = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostUsersUuidWebhooks201ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostUsersUuidWebhooks201ApplicationJSON.class);
                res.postUsersUuidWebhooks201ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 404 || httpRes.statusCode() == 409) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostUsersUuidWebhooksErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostUsersUuidWebhooksErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostUsersUuidWebhooks403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostUsersUuidWebhooks403ApplicationJSON.class);
                res.postUsersUuidWebhooks403ApplicationJSONObject = out;
            }
        }

        return res;
    }
}