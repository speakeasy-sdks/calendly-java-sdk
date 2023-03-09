package calendly.calendly;

import calendly.calendly.utils.HTTPClient;
import calendly.calendly.utils.HTTPRequest;
import calendly.calendly.utils.JSON;
import calendly.calendly.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class ScheduledEvents {
	
	
	
	
	
	
	
	
	
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public ScheduledEvents(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
    
    /**
     * deleteInviteeNoShow - Delete Invitee No Show
     *
     * Undoes marking an Invitee as a No Show.
    **/
    public calendly.calendly.models.operations.DeleteInviteeNoShowResponse deleteInviteeNoShow(calendly.calendly.models.operations.DeleteInviteeNoShowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/invitee_no_shows/{uuid}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = calendly.calendly.utils.Utils.configureSecurityClient(this._defaultClient, request.security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.DeleteInviteeNoShowResponse res = new calendly.calendly.models.operations.DeleteInviteeNoShowResponse() {{
            errorResponse = null;
            errorResponse = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.DeleteInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.DeleteInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.DeleteInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.DeleteInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.DeleteInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.DeleteInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.DeleteInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.DeleteInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * getScheduledEventsEventUuidInviteesInviteeUuid - Get Event Invitee
     *
     * Returns information about a specified Invitee (person invited to an event).
    **/
    public calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidResponse getScheduledEventsEventUuidInviteesInviteeUuid(calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/scheduled_events/{event_uuid}/invitees/{invitee_uuid}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = calendly.calendly.utils.Utils.configureSecurityClient(this._defaultClient, request.security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidResponse res = new calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidResponse() {{
            getScheduledEventsEventUuidInviteesInviteeUuid200ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            errorResponse1 = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuid200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuid200ApplicationJSON.class);
                res.getScheduledEventsEventUuidInviteesInviteeUuid200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.shared.ErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.shared.ErrorResponse.class);
                res.errorResponse1 = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * getScheduledEventsUuid - Get Event
     *
     * Returns information about a specified Event.
    **/
    public calendly.calendly.models.operations.GetScheduledEventsUuidResponse getScheduledEventsUuid(calendly.calendly.models.operations.GetScheduledEventsUuidRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/scheduled_events/{uuid}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = calendly.calendly.utils.Utils.configureSecurityClient(this._defaultClient, request.security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetScheduledEventsUuidResponse res = new calendly.calendly.models.operations.GetScheduledEventsUuidResponse() {{
            getScheduledEventsUuid200ApplicationJSONObject = null;
            errorResponse = null;
            getScheduledEventsUuid403ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsUuid200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsUuid200ApplicationJSON.class);
                res.getScheduledEventsUuid200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsUuidErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsUuidErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsUuid403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsUuid403ApplicationJSON.class);
                res.getScheduledEventsUuid403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsUuidErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsUuidErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsUuidErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsUuidErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * getInviteeNoShow - Get Invitee No Show
     *
     * Returns information about a specified Invitee No Show.
    **/
    public calendly.calendly.models.operations.GetInviteeNoShowResponse getInviteeNoShow(calendly.calendly.models.operations.GetInviteeNoShowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/invitee_no_shows/{uuid}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = calendly.calendly.utils.Utils.configureSecurityClient(this._defaultClient, request.security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetInviteeNoShowResponse res = new calendly.calendly.models.operations.GetInviteeNoShowResponse() {{
            getInviteeNoShow200ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetInviteeNoShow200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetInviteeNoShow200ApplicationJSON.class);
                res.getInviteeNoShow200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * getInvitees - List Event Invitees
     *
     * Returns a list of Invitees for an event.
    **/
    public calendly.calendly.models.operations.GetInviteesResponse getInvitees(calendly.calendly.models.operations.GetInviteesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/scheduled_events/{uuid}/invitees", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = calendly.calendly.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = calendly.calendly.utils.Utils.configureSecurityClient(this._defaultClient, request.security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetInviteesResponse res = new calendly.calendly.models.operations.GetInviteesResponse() {{
            getInvitees200ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            getInvitees403ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetInvitees200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetInvitees200ApplicationJSON.class);
                res.getInvitees200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetInviteesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetInviteesErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetInviteesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetInviteesErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetInvitees403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetInvitees403ApplicationJSON.class);
                res.getInvitees403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetInviteesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetInviteesErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetInviteesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetInviteesErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * getScheduledEvents - List Events
     *
     * Returns a list of  Events.
     * 
     * * Pass `organization` parameter to return events for that organization (requires admin/owner privilege)
     * * Pass `user` parameter to return events for a specific User
     * 
     * **NOTES:**
     * * If you are the admin/owner of the organization, you can use both `organization` and `user` to get a list of events for a specific user within your organization.
     * 
     * * `user` can only be used alone when requesting your own personal events. This will return your events within any organization that you are currently in or were a part of in the past.
    **/
    public calendly.calendly.models.operations.GetScheduledEventsResponse getScheduledEvents(calendly.calendly.models.operations.GetScheduledEventsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/scheduled_events");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = calendly.calendly.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = calendly.calendly.utils.Utils.configureSecurityClient(this._defaultClient, request.security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetScheduledEventsResponse res = new calendly.calendly.models.operations.GetScheduledEventsResponse() {{
            getScheduledEvents200ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            getScheduledEvents403ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEvents200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEvents200ApplicationJSON.class);
                res.getScheduledEvents200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEvents403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEvents403ApplicationJSON.class);
                res.getScheduledEvents403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetScheduledEventsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetScheduledEventsErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * postScheduledEventsUuidCancellationJson - Cancel Event
     *
     * Cancels specified event.
    **/
    public calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonResponse postScheduledEventsUuidCancellationJson(calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/scheduled_events/{uuid}/cancellation", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = calendly.calendly.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = calendly.calendly.utils.Utils.configureSecurityClient(this._defaultClient, request.security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonResponse res = new calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonResponse() {{
            postScheduledEventsUuidCancellationJSON201ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            postScheduledEventsUuidCancellationJSON403ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJSON201ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJSON201ApplicationJSON.class);
                res.postScheduledEventsUuidCancellationJSON201ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJSON403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJSON403ApplicationJSON.class);
                res.postScheduledEventsUuidCancellationJSON403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * postScheduledEventsUuidCancellationMultipart - Cancel Event
     *
     * Cancels specified event.
    **/
    public calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartResponse postScheduledEventsUuidCancellationMultipart(calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/scheduled_events/{uuid}/cancellation", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = calendly.calendly.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = calendly.calendly.utils.Utils.configureSecurityClient(this._defaultClient, request.security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartResponse res = new calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartResponse() {{
            postScheduledEventsUuidCancellationMultipart201ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            postScheduledEventsUuidCancellationMultipart403ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipart201ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipart201ApplicationJSON.class);
                res.postScheduledEventsUuidCancellationMultipart201ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipart403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipart403ApplicationJSON.class);
                res.postScheduledEventsUuidCancellationMultipart403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * postScheduledEventsUuidCancellationRaw - Cancel Event
     *
     * Cancels specified event.
    **/
    public calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawResponse postScheduledEventsUuidCancellationRaw(calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/scheduled_events/{uuid}/cancellation", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = calendly.calendly.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = calendly.calendly.utils.Utils.configureSecurityClient(this._defaultClient, request.security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawResponse res = new calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawResponse() {{
            postScheduledEventsUuidCancellationRaw201ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            postScheduledEventsUuidCancellationRaw403ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRaw201ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRaw201ApplicationJSON.class);
                res.postScheduledEventsUuidCancellationRaw201ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRaw403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRaw403ApplicationJSON.class);
                res.postScheduledEventsUuidCancellationRaw403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * postInviteeNoShow - Create Invitee No Show
     *
     * Marks an Invitee as a No Show.
    **/
    public calendly.calendly.models.operations.PostInviteeNoShowResponse postInviteeNoShow(calendly.calendly.models.operations.PostInviteeNoShowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/invitee_no_shows");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = calendly.calendly.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = calendly.calendly.utils.Utils.configureSecurityClient(this._defaultClient, request.security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.PostInviteeNoShowResponse res = new calendly.calendly.models.operations.PostInviteeNoShowResponse() {{
            postInviteeNoShow201ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            errorResponse = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostInviteeNoShow201ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostInviteeNoShow201ApplicationJSON.class);
                res.postInviteeNoShow201ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
}