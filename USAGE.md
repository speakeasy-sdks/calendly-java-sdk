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
            SDK.Builder builder = SDK.builder();

            builder.setSecurity(
                new Security() {{
                    oauth2 = new SchemeOauth2() {{
                        authorization = "Bearer YOUR_ACCESS_TOKEN_HERE";
                    }};
                }}
            );

            SDK sdk = builder.build();

            ActivityLogRequest req = new ActivityLogRequest() {{
                queryParams = new ActivityLogQueryParams() {{
                    action = new String[]{{
                        add("deserunt"),
                        add("porro"),
                        add("nulla"),
                    }};
                    actor = new String[]{{
                        add("vero"),
                        add("perspiciatis"),
                        add("nulla"),
                    }};
                    count = 423655;
                    maxOccurredAt = "2022-07-24T22:46:29.801Z";
                    minOccurredAt = "2022-07-16T19:09:37.739Z";
                    namespace = new String[]{{
                        add("iusto"),
                        add("ullam"),
                    }};
                    organization = "saepe";
                    pageToken = "inventore";
                    searchTerm = "sapiente";
                    sort = new calendly.calendly.models.operations.ActivityLogSortEnum[]{{
                        add("actor.uri:asc"),
                        add("actor.uri:desc"),
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