package calendly.calendly.models.operations;

import calendly.calendly.utils.SpeakeasyMetadata;

public class GetScheduledEventsEventUuidInviteesInviteeUuidPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=event_uuid")
    public String eventUuid;
    public GetScheduledEventsEventUuidInviteesInviteeUuidPathParams withEventUuid(String eventUuid) {
        this.eventUuid = eventUuid;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=invitee_uuid")
    public String inviteeUuid;
    public GetScheduledEventsEventUuidInviteesInviteeUuidPathParams withInviteeUuid(String inviteeUuid) {
        this.inviteeUuid = inviteeUuid;
        return this;
    }
    
}
