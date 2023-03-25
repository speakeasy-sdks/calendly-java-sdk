# calendly

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'calendly.calendly:calendly:0.4.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
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
                    maxOccurredAt = "2022-09-07T03:47:12.887Z";
                    minOccurredAt = "2022-05-19T19:02:18.285Z";
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

<!-- Start SDK Available Operations -->
## SDK Available Operations


### activityLog

* `activityLog` - List activity log entries

### availability

* `getUserAvailabilitySchedules` - List User Availability Schedules
* `getUserAvailabilitySchedulesUuid` - Get User Availability Schedule
* `getUserBusyTimes` - List User Busy Times

### dataCompliance

* `postDataComplianceDeletionEvents` - Delete Scheduled Event Data
* `postDataComplianceDeletionInvitees` - Delete Invitee Data

### eventTypes

* `getEventTypesUuid` - Get Event Type
* `getEventTypeAvailableTimes` - List Event Type Available Times
* `getEventTypes` - List User's Event Types

### organizations

* `deleteOrganizationsUuidMemberships` - Remove User from Organization
* `getOrganizationMemberships` - List Organization Memberships
* `getOrganizationsOrgUuidInvitationsUuid` - Get Organization Invitation
* `getOrganizationsUuidInvitations` - List Organization Invitations
* `getOrganizationsUuidMemberships` - Get Organization Membership
* `postOrganizationsUuidInvitations` - Invite User to Organization
* `revokeUsersOrganizationInvitation` - Revoke User's Organization Invitation

### routingForms

* `getRoutingFormSubmissions` - List Routing Form Submissions
* `getRoutingFormSubmissionsUuid` - Get Routing Form Submission
* `getRoutingForms` - List Routing Forms
* `getRoutingFormsUuid` - Get Routing Form

### scheduledEvents

* `deleteInviteeNoShow` - Delete Invitee No Show
* `getScheduledEventsEventUuidInviteesInviteeUuid` - Get Event Invitee
* `getScheduledEventsUuid` - Get Event
* `getInviteeNoShow` - Get Invitee No Show
* `getInvitees` - List Event Invitees
* `getScheduledEvents` - List Events
* `postScheduledEventsUuidCancellationJson` - Cancel Event
* `postScheduledEventsUuidCancellationMultipart` - Cancel Event
* `postScheduledEventsUuidCancellationRaw` - Cancel Event
* `postInviteeNoShow` - Create Invitee No Show

### schedulingLinks

* `postSchedulingLinks` - Create Single-Use Scheduling Link

### shares

* `postShares` - Create Share

### users

* `getMyUserAccount` - Get current user
* `getUser` - Get user

### webhooks

* `deleteUsersUserUuidWebhooksWebhookUuid` - Delete Webhook Subscription
* `getUsersUserUuidWebhooksWebhookUuid` - Get Webhook Subscription
* `getWebhooks` - List Webhook Subscriptions
* `postUsersUuidWebhooks` - Create Webhook Subscription
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
