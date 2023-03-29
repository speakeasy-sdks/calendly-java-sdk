<!-- Start SDK Example Usage -->
```java
package hello.world;

import calendly.calendly.SDK;
import calendly.calendly.models.shared.Security;
import calendly.calendly.models.operations.ActivityLogSortEnum;
import calendly.calendly.models.operations.ActivityLogQueryParams;
import calendly.calendly.models.operations.ActivityLogRequest;
import calendly.calendly.models.operations.ActivityLogResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    oauth2 = new SchemeOauth2() {{
                        authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                    }};
                }})
                .build();

            ActivityLogRequest req = new ActivityLogRequest() {{
                queryParams = new ActivityLogQueryParams() {{
                    action = new String[]{{
                        add("deserunt"),
                        add("porro"),
                        add("nulla"),
                    }};
                    actor = new String[]{{
                        add("https://api.calendly.com/users/EBHAAFHDCAEQTSEZ"),
                        add("https://api.calendly.com/users/EBHAAFHDCAEQTSEZ"),
                        add("https://api.calendly.com/users/EBHAAFHDCAEQTSEZ"),
                    }};
                    count = 857946;
                    maxOccurredAt = "2022-09-11T03:56:07.072Z";
                    minOccurredAt = "2022-05-23T19:11:12.470Z";
                    namespace = new String[]{{
                        add("fuga"),
                        add("facilis"),
                    }};
                    organization = "https://api.calendly.com/organizations/EBHAAFHDCAEQTSEZ";
                    pageToken = "eum";
                    searchTerm = "iusto";
                    sort = new calendly.calendly.models.operations.ActivityLogSortEnum[]{{
                        add("occurred_at:asc"),
                        add("action:asc"),
                    }};
                }};
            }};            

            ActivityLogResponse res = sdk.activityLog.activityLog(req);

            if (res.activityLog200ApplicationJSONObject.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->