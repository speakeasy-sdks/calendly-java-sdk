package calendly.calendly;

import calendly.calendly.utils.HTTPClient;
import calendly.calendly.utils.HTTPRequest;
import calendly.calendly.utils.JSON;
import calendly.calendly.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class DataCompliance {
	
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public DataCompliance(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
    
    /**
     * postDataComplianceDeletionEvents - Delete Scheduled Event Data
     *
     * <!-- theme: info -->
     *   > This endpoint requires an <strong>Enterprise</strong> subscription.
     * 
     * To submit a request to remove scheduled events data within a time range for your organization, use this endpoint. Requests for data deletion can take up to 7 days to complete.
     * 
     * Time range can be no greater than 24 months and must occur in the past.
    **/
    public calendly.calendly.models.operations.PostDataComplianceDeletionEventsResponse postDataComplianceDeletionEvents(calendly.calendly.models.operations.PostDataComplianceDeletionEventsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/data_compliance/deletion/events");
        
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

        calendly.calendly.models.operations.PostDataComplianceDeletionEventsResponse res = new calendly.calendly.models.operations.PostDataComplianceDeletionEventsResponse() {{
            postDataComplianceDeletionEvents202ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            errorResponse1 = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 202) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.Map.class);
                res.postDataComplianceDeletionEvents202ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostDataComplianceDeletionEventsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostDataComplianceDeletionEventsErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostDataComplianceDeletionEventsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostDataComplianceDeletionEventsErrorResponse.class);
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
                calendly.calendly.models.operations.PostDataComplianceDeletionEventsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostDataComplianceDeletionEventsErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostDataComplianceDeletionEventsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostDataComplianceDeletionEventsErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * postDataComplianceDeletionInvitees - Delete Invitee Data
     *
     * <!-- theme: info -->
     *   > This endpoint requires an <strong>Enterprise</strong> subscription.
     * 
     * To submit a request to remove invitee data from all previously booked events in your organization, use this endpoint. Requests for data deletion can take up to 7 days to complete.
    **/
    public calendly.calendly.models.operations.PostDataComplianceDeletionInviteesResponse postDataComplianceDeletionInvitees(calendly.calendly.models.operations.PostDataComplianceDeletionInviteesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/data_compliance/deletion/invitees");
        
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

        calendly.calendly.models.operations.PostDataComplianceDeletionInviteesResponse res = new calendly.calendly.models.operations.PostDataComplianceDeletionInviteesResponse() {{
            postDataComplianceDeletionInvitees202ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            errorResponse1 = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 202) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.Map.class);
                res.postDataComplianceDeletionInvitees202ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostDataComplianceDeletionInviteesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostDataComplianceDeletionInviteesErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostDataComplianceDeletionInviteesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostDataComplianceDeletionInviteesErrorResponse.class);
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
                calendly.calendly.models.operations.PostDataComplianceDeletionInviteesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostDataComplianceDeletionInviteesErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostDataComplianceDeletionInviteesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostDataComplianceDeletionInviteesErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
}