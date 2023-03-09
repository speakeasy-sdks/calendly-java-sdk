package calendly.calendly;

import calendly.calendly.utils.HTTPClient;
import calendly.calendly.utils.SpeakeasyHTTPClient;

/** SDK Documentation: Calendly’s API is [REST](http://en.wikipedia.org/wiki/Representational_State_Transfer)-based and has predictable resource-oriented URLs. It uses **JSON** for request and response bodies and standard HTTP methods, authentication, and response codes.<br>
 * 
 * ##### Authenticate with personal access tokens or OAuth 2.0
 * 
 * To access Calendly data through the API, you can authenticate with **personal access tokens** or **OAuth 2.0**. To learn more about these authentication methods and when and how to use them, see [Getting Started with the Calendly API](https://developer.calendly.com/getting-started).**/
public class SDK {
	public static final String[] SERVERS = {
		"https://api.calendly.com",
	};
  	
  	public ActivityLog activityLog;
  	public Availability availability;
  	public DataCompliance dataCompliance;
  	public EventTypes eventTypes;
  	public Organizations organizations;
  	public RoutingForms routingForms;
  	public ScheduledEvents scheduledEvents;
  	public SchedulingLinks schedulingLinks;
  	public Shares shares;
  	public Users users;
  	public Webhooks webhooks;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private calendly.calendly.models.shared.Security _security;
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "0.0.1";
	private String _genVersion = "1.9.1";

	public static class Builder {
		private HTTPClient client;
		private calendly.calendly.models.shared.Security security;
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		public Builder setSecurity(calendly.calendly.models.shared.Security security) {
			this.security = security;
			return this;
		}
		
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		public SDK build() throws Exception {
			return new SDK(this.client, this.security, this.serverUrl, this.params);
		}
	}

	public static Builder builder() {
		return new Builder();
	}

	private SDK(HTTPClient client, calendly.calendly.models.shared.Security security, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (security != null) {
			this._security = security;
			this._securityClient = calendly.calendly.utils.Utils.configureSecurityClient(this._defaultClient, this._security);
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = calendly.calendly.utils.Utils.templateUrl(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS[0];
		}
		
		this.activityLog = new ActivityLog(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.availability = new Availability(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.dataCompliance = new DataCompliance(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.eventTypes = new EventTypes(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.organizations = new Organizations(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.routingForms = new RoutingForms(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.scheduledEvents = new ScheduledEvents(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.schedulingLinks = new SchedulingLinks(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.shares = new Shares(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.users = new Users(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.webhooks = new Webhooks(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
	}
}