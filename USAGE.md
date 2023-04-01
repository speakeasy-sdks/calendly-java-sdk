<!-- Start SDK Example Usage -->
```java
package hello.world;

import calendly.calendly.SDK;
import calendly.calendly.models.shared.Security;
import calendly.calendly.models.operations.ActivityLogSortEnum;
import calendly.calendly.models.operations.ActivityLogRequest;
import calendly.calendly.models.operations.ActivityLogResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    oauth2 = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ActivityLogRequest req = new ActivityLogRequest() {{
                action = new String[]{{
                    add("provident"),
                    add("distinctio"),
                    add("quibusdam"),
                }};
                actor = new String[]{{
                    add("https://api.calendly.com/users/EBHAAFHDCAEQTSEZ"),
                    add("https://api.calendly.com/users/EBHAAFHDCAEQTSEZ"),
                    add("https://api.calendly.com/users/EBHAAFHDCAEQTSEZ"),
                }};
                count = 857946;
                maxOccurredAt = "2021-04-22T12:08:58.275Z";
                minOccurredAt = "2022-05-18T09:34:54.894Z";
                namespace = new String[]{{
                    add("suscipit"),
                    add("iure"),
                    add("magnam"),
                }};
                organization = "https://api.calendly.com/organizations/EBHAAFHDCAEQTSEZ";
                pageToken = "debitis";
                searchTerm = "ipsa";
                sort = new calendly.calendly.models.operations.ActivityLogSortEnum[]{{
                    add("actor.display_name:asc"),
                    add("actor.display_name:desc"),
                    add("actor.uri:asc"),
                    add("namespace:desc"),
                }};
            }}            

            ActivityLogResponse res = sdk.activityLog.activityLog(req);

            if (res.activityLog200ApplicationJSONObject.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->