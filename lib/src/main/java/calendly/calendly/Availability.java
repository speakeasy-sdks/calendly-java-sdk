package calendly.calendly;

import calendly.calendly.utils.HTTPClient;
import calendly.calendly.utils.HTTPRequest;
import calendly.calendly.utils.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Availability {
	
	
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Availability(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
    
    /**
     * getUserAvailabilitySchedules - List User Availability Schedules
     *
     * Returns the availability schedules of the given user.
    **/
    public calendly.calendly.models.operations.GetUserAvailabilitySchedulesResponse getUserAvailabilitySchedules(calendly.calendly.models.operations.GetUserAvailabilitySchedulesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/user_availability_schedules");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = calendly.calendly.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetUserAvailabilitySchedulesResponse res = new calendly.calendly.models.operations.GetUserAvailabilitySchedulesResponse() {{
            getUserAvailabilitySchedules200ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            getUserAvailabilitySchedules403ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserAvailabilitySchedules200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserAvailabilitySchedules200ApplicationJSON.class);
                res.getUserAvailabilitySchedules200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserAvailabilitySchedulesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserAvailabilitySchedulesErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserAvailabilitySchedulesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserAvailabilitySchedulesErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserAvailabilitySchedules403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserAvailabilitySchedules403ApplicationJSON.class);
                res.getUserAvailabilitySchedules403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserAvailabilitySchedulesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserAvailabilitySchedulesErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserAvailabilitySchedulesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserAvailabilitySchedulesErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * getUserAvailabilitySchedulesUuid - Get User Availability Schedule
     *
     * This will return the availability schedule of the given UUID.
    **/
    public calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuidResponse getUserAvailabilitySchedulesUuid(calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuidRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/user_availability_schedules/{uuid}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuidResponse res = new calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuidResponse() {{
            getUserAvailabilitySchedulesUuid200ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            getUserAvailabilitySchedulesUuid403ApplicationJSONObject = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuid200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuid200ApplicationJSON.class);
                res.getUserAvailabilitySchedulesUuid200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuidErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuidErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuidErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuidErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuid403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuid403ApplicationJSON.class);
                res.getUserAvailabilitySchedulesUuid403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuidErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserAvailabilitySchedulesUuidErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
        }

        return res;
    }
	
    
    /**
     * getUserBusyTimes - List User Busy Times
     *
     * Returns an ascending list of user internal and external scheduled events within a specified date range.
     * 
     * Date range can be no greater than 1 week (7 days).
     * 
     * **NOTE:**
     * * This endpoint does not support traditional keyset pagination.
     * * External events will only be returned for calendars that have "Check for conflicts" configured.
    **/
    public calendly.calendly.models.operations.GetUserBusyTimesResponse getUserBusyTimes(calendly.calendly.models.operations.GetUserBusyTimesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/user_busy_times");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = calendly.calendly.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.GetUserBusyTimesResponse res = new calendly.calendly.models.operations.GetUserBusyTimesResponse() {{
            getUserBusyTimes200ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse = null;
            getUserBusyTimes403ApplicationJSONObject = null;
            errorResponse = null;
            errorResponse1 = null;
            errorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserBusyTimes200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserBusyTimes200ApplicationJSON.class);
                res.getUserBusyTimes200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserBusyTimesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserBusyTimesErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserBusyTimesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserBusyTimesErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserBusyTimes403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserBusyTimes403ApplicationJSON.class);
                res.getUserBusyTimes403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserBusyTimesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserBusyTimesErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 424) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.shared.ErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.shared.ErrorResponse.class);
                res.errorResponse1 = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.GetUserBusyTimesErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.GetUserBusyTimesErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
}