package calendly.calendly;

import calendly.calendly.utils.HTTPClient;
import calendly.calendly.utils.HTTPRequest;
import calendly.calendly.utils.JSON;
import calendly.calendly.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class SchedulingLinks {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public SchedulingLinks(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
    
    /**
     * postSchedulingLinks - Create Single-Use Scheduling Link
     *
     * Creates a single-use scheduling link.
    **/
    public calendly.calendly.models.operations.PostSchedulingLinksResponse postSchedulingLinks(calendly.calendly.models.operations.PostSchedulingLinksRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = calendly.calendly.utils.Utils.generateURL(baseUrl, "/scheduling_links");
        
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

        calendly.calendly.models.operations.PostSchedulingLinksResponse res = new calendly.calendly.models.operations.PostSchedulingLinksResponse() {{
            postSchedulingLinks201ApplicationJSONObject = null;
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
                calendly.calendly.models.operations.PostSchedulingLinks201ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostSchedulingLinks201ApplicationJSON.class);
                res.postSchedulingLinks201ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostSchedulingLinksErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostSchedulingLinksErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostSchedulingLinksErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostSchedulingLinksErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostSchedulingLinksErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostSchedulingLinksErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostSchedulingLinksErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostSchedulingLinksErrorResponse.class);
                res.errorResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            if (calendly.calendly.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                calendly.calendly.models.operations.PostSchedulingLinksErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), calendly.calendly.models.operations.PostSchedulingLinksErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
}