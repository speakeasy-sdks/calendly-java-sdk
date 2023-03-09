<!-- Start SDK Example Usage -->
```java
package hello.world;

import calendly.calendly.SDK;

import calendly.calendly.models.operations.ActivityLogSortEnum;
import calendly.calendly.models.operations.ActivityLogQueryParams;
import calendly.calendly.models.operations.ActivityLogRequest;
import calendly.calendly.models.operations.ActivityLogResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK.Builder builder = SDK.builder();

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
                    maxOccurredAt = "2022-07-24T22:01:42.406Z";
                    minOccurredAt = "2022-07-16T18:24:50.344Z";
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