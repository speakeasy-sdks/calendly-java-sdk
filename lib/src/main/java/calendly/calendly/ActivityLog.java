package calendly.calendly;

import calendly.calendly.utils.HTTPClient;
import calendly.calendly.utils.HTTPRequest;
import calendly.calendly.utils.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

public class ActivityLog {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public ActivityLog(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
    
    /**
     * activityLog - List activity log entries
     *
     * <!-- theme: info -->
     *   > This endpoint requires an <strong>Enterprise</strong> subscription.
     * 
     * Returns a list of activity log entries
    **/
    public calendly.calendly.models.operations.ActivityLogResponse activityLog(calendly.calendly.models.operations.ActivityLogRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/activity_log_entries");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = calendly.calendly.utils.Utils.getQueryParams(calendly.calendly.models.operations.ActivityLogQueryParams.class, request.queryParams, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        calendly.calendly.models.operations.ActivityLogResponse res = new calendly.calendly.models.operations.ActivityLogResponse() {{
            activityLog200ApplicationJSONObject = null;
            errorResponse = null;
            activityLog403ApplicationJSONObject = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.ActivityLog200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.ActivityLog200ApplicationJSON.class);
                res.activityLog200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400 || httpRes.statusCode() == 404 || httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.ActivityLogErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.ActivityLogErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.ActivityLog403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.ActivityLog403ApplicationJSON.class);
                res.activityLog403ApplicationJSONObject = out;
            }
        }

        return res;
    }
}