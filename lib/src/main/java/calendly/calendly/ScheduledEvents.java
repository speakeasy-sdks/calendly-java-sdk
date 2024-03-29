/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

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
     * Cancel Event
     * Cancels specified event.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonResponse cancel(calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonRequest.class, baseUrl, "/scheduled_events/{uuid}/cancellation", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = calendly.calendly.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonResponse res = new calendly.calendly.models.operations.PostScheduledEventsUuidCancellationJsonResponse() {{
            postScheduledEventsUuidCancellationJSON201ApplicationJSONObject = null;
            errorResponse = null;
            postScheduledEventsUuidCancellationJSON403ApplicationJSONObject = null;
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
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
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

        return res;
    }

    /**
     * Cancel Event
     * Cancels specified event.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartResponse cancel(calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartRequest.class, baseUrl, "/scheduled_events/{uuid}/cancellation", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = calendly.calendly.utils.Utils.serializeRequestBody(request, "requestBody", "multipart");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartResponse res = new calendly.calendly.models.operations.PostScheduledEventsUuidCancellationMultipartResponse() {{
            postScheduledEventsUuidCancellationMultipart201ApplicationJSONObject = null;
            errorResponse = null;
            postScheduledEventsUuidCancellationMultipart403ApplicationJSONObject = null;
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
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
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

        return res;
    }

    /**
     * Cancel Event
     * Cancels specified event.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawResponse cancel(calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawRequest.class, baseUrl, "/scheduled_events/{uuid}/cancellation", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = calendly.calendly.utils.Utils.serializeRequestBody(request, "requestBody", "raw");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawResponse res = new calendly.calendly.models.operations.PostScheduledEventsUuidCancellationRawResponse() {{
            postScheduledEventsUuidCancellationRaw201ApplicationJSONObject = null;
            errorResponse = null;
            postScheduledEventsUuidCancellationRaw403ApplicationJSONObject = null;
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
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
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

        return res;
    }

    /**
     * Create Invitee No Show
     * Marks an Invitee as a No Show.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public calendly.calendly.models.operations.PostInviteeNoShowResponse createNoShow(calendly.calendly.models.operations.PostInviteeNoShowRequestBody request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/invitee_no_shows");
        
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

        calendly.calendly.models.operations.PostInviteeNoShowResponse res = new calendly.calendly.models.operations.PostInviteeNoShowResponse() {{
            postInviteeNoShow201ApplicationJSONObject = null;
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
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }

    /**
     * Get Event
     * Returns information about a specified Event.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public calendly.calendly.models.operations.GetScheduledEventsUuidResponse getEventByUuid(calendly.calendly.models.operations.GetScheduledEventsUuidRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(calendly.calendly.models.operations.GetScheduledEventsUuidRequest.class, baseUrl, "/scheduled_events/{uuid}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetScheduledEventsUuidResponse res = new calendly.calendly.models.operations.GetScheduledEventsUuidResponse() {{
            getScheduledEventsUuid200ApplicationJSONObject = null;
            errorResponse = null;
            getScheduledEventsUuid403ApplicationJSONObject = null;
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
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
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

        return res;
    }

    /**
     * List Event Invitees
     * Returns a list of Invitees for an event.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public calendly.calendly.models.operations.GetInviteesResponse getInvitees(calendly.calendly.models.operations.GetInviteesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(calendly.calendly.models.operations.GetInviteesRequest.class, baseUrl, "/scheduled_events/{uuid}/invitees", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = calendly.calendly.utils.Utils.getQueryParams(calendly.calendly.models.operations.GetInviteesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetInviteesResponse res = new calendly.calendly.models.operations.GetInviteesResponse() {{
            getInvitees200ApplicationJSONObject = null;
            errorResponse = null;
            getInvitees403ApplicationJSONObject = null;
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
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
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

        return res;
    }

    /**
     * Get Event Invitee
     * Returns information about a specified Invitee (person invited to an event).
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidResponse getInviteesByUuid(calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidRequest.class, baseUrl, "/scheduled_events/{event_uuid}/invitees/{invitee_uuid}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidResponse res = new calendly.calendly.models.operations.GetScheduledEventsEventUuidInviteesInviteeUuidResponse() {{
            getScheduledEventsEventUuidInviteesInviteeUuid200ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse1 = null;
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
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
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

        return res;
    }

    /**
     * Get Invitee No Show
     * Returns information about a specified Invitee No Show.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public calendly.calendly.models.operations.GetInviteeNoShowResponse getNoShow(calendly.calendly.models.operations.GetInviteeNoShowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(calendly.calendly.models.operations.GetInviteeNoShowRequest.class, baseUrl, "/invitee_no_shows/{uuid}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetInviteeNoShowResponse res = new calendly.calendly.models.operations.GetInviteeNoShowResponse() {{
            getInviteeNoShow200ApplicationJSONObject = null;
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
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }

    /**
     * List Events
     * Returns a list of  Events.
     * 
     * * Pass `organization` parameter to return events for that organization (requires admin/owner privilege)
     * * Pass `user` parameter to return events for a specific User
     * 
     * **NOTES:**
     * * If you are the admin/owner of the organization, you can use both `organization` and `user` to get a list of events for a specific user within your organization.
     * 
     * * `user` can only be used alone when requesting your own personal events. This will return your events within any organization that you are currently in or were a part of in the past.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public calendly.calendly.models.operations.ListScheduledEventsResponse list(calendly.calendly.models.operations.ListScheduledEventsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/scheduled_events");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = calendly.calendly.utils.Utils.getQueryParams(calendly.calendly.models.operations.ListScheduledEventsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.ListScheduledEventsResponse res = new calendly.calendly.models.operations.ListScheduledEventsResponse() {{
            listScheduledEvents200ApplicationJSONObject = null;
            errorResponse = null;
            listScheduledEvents403ApplicationJSONObject = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.ListScheduledEvents200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.ListScheduledEvents200ApplicationJSON.class);
                res.listScheduledEvents200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 401 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.ListScheduledEventsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.ListScheduledEventsErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.ListScheduledEvents403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.ListScheduledEvents403ApplicationJSON.class);
                res.listScheduledEvents403ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Delete Invitee No Show
     * Undoes marking an Invitee as a No Show.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public calendly.calendly.models.operations.DeleteInviteeNoShowResponse unmarkNoShow(calendly.calendly.models.operations.DeleteInviteeNoShowRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(calendly.calendly.models.operations.DeleteInviteeNoShowRequest.class, baseUrl, "/invitee_no_shows/{uuid}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.DeleteInviteeNoShowResponse res = new calendly.calendly.models.operations.DeleteInviteeNoShowResponse() {{
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
                calendly.calendly.models.operations.DeleteInviteeNoShowErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.DeleteInviteeNoShowErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
}