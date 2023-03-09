package calendly.calendly.models.shared;

import calendly.calendly.utils.DateTimeDeserializer;
import calendly.calendly.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * Invitee
 * An individual who has been invited to meet with a Calendly member
**/
public class Invitee {
    @JsonProperty("cancel_url")
    public String cancelUrl;
    public Invitee withCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cancellation")
    public Cancellation cancellation;
    public Invitee withCancellation(Cancellation cancellation) {
        this.cancellation = cancellation;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public Invitee withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("email")
    public String email;
    public Invitee withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonProperty("event")
    public String event;
    public Invitee withEvent(String event) {
        this.event = event;
        return this;
    }
    
    @JsonProperty("first_name")
    public String firstName;
    public Invitee withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    @JsonProperty("last_name")
    public String lastName;
    public Invitee withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public Invitee withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("new_invitee")
    public String newInvitee;
    public Invitee withNewInvitee(String newInvitee) {
        this.newInvitee = newInvitee;
        return this;
    }
    
    @JsonProperty("no_show")
    public InviteeNoShow1 noShow;
    public Invitee withNoShow(InviteeNoShow1 noShow) {
        this.noShow = noShow;
        return this;
    }
    
    @JsonProperty("old_invitee")
    public String oldInvitee;
    public Invitee withOldInvitee(String oldInvitee) {
        this.oldInvitee = oldInvitee;
        return this;
    }
    
    @JsonProperty("payment")
    public InviteePayment payment;
    public Invitee withPayment(InviteePayment payment) {
        this.payment = payment;
        return this;
    }
    
    @JsonProperty("questions_and_answers")
    public InviteeQuestionAndAnswer[] questionsAndAnswers;
    public Invitee withQuestionsAndAnswers(InviteeQuestionAndAnswer[] questionsAndAnswers) {
        this.questionsAndAnswers = questionsAndAnswers;
        return this;
    }
    
    @JsonProperty("reconfirmation")
    public InviteeReconfirmation reconfirmation;
    public Invitee withReconfirmation(InviteeReconfirmation reconfirmation) {
        this.reconfirmation = reconfirmation;
        return this;
    }
    
    @JsonProperty("reschedule_url")
    public String rescheduleUrl;
    public Invitee withRescheduleUrl(String rescheduleUrl) {
        this.rescheduleUrl = rescheduleUrl;
        return this;
    }
    
    @JsonProperty("rescheduled")
    public Boolean rescheduled;
    public Invitee withRescheduled(Boolean rescheduled) {
        this.rescheduled = rescheduled;
        return this;
    }
    
    @JsonProperty("routing_form_submission")
    public String routingFormSubmission;
    public Invitee withRoutingFormSubmission(String routingFormSubmission) {
        this.routingFormSubmission = routingFormSubmission;
        return this;
    }
    
    @JsonProperty("status")
    public InviteeStatusEnum status;
    public Invitee withStatus(InviteeStatusEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonProperty("text_reminder_number")
    public String textReminderNumber;
    public Invitee withTextReminderNumber(String textReminderNumber) {
        this.textReminderNumber = textReminderNumber;
        return this;
    }
    
    @JsonProperty("timezone")
    public String timezone;
    public Invitee withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
    @JsonProperty("tracking")
    public InviteeTracking tracking;
    public Invitee withTracking(InviteeTracking tracking) {
        this.tracking = tracking;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public Invitee withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("uri")
    public String uri;
    public Invitee withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
