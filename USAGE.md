<!-- Start SDK Example Usage -->
```java
package hello.world;

import calendly.calendly.SDK;
import calendly.calendly.models.shared.Security;
import calendly.calendly.models.operations.ListScheduledEventsStatusEnum;
import calendly.calendly.models.operations.ListScheduledEventsRequest;
import calendly.calendly.models.operations.ListScheduledEventsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    oauth2 = "Bearer YOUR_ACCESS_TOKEN_HERE";
                }})
                .build();

            ListScheduledEventsRequest req = new ListScheduledEventsRequest() {{
                count = 5488.14;
                inviteeEmail = "alice@example.com";
                maxStartTime = "provident";
                minStartTime = "distinctio";
                organization = "https://api.calendly.com/organizations/EBHAAFHDCAEQTSEZ";
                pageToken = "quibusdam";
                sort = "unde";
                status = "canceled";
                user = "https://api.calendly.com/users/EBHAAFHDCAEQTSEZ";
            }}            

            ListScheduledEventsResponse res = sdk.scheduledEvents.list(req);

            if (res.listScheduledEvents200ApplicationJSONObject.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->