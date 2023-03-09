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
 * RoutingFormSubmission
 * Information about a Routing Form Submission.
**/
public class RoutingFormSubmission {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public RoutingFormSubmission withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonProperty("questions_and_answers")
    public SubmissionQuestionAndAnswer[] questionsAndAnswers;
    public RoutingFormSubmission withQuestionsAndAnswers(SubmissionQuestionAndAnswer[] questionsAndAnswers) {
        this.questionsAndAnswers = questionsAndAnswers;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result")
    public Object result;
    public RoutingFormSubmission withResult(Object result) {
        this.result = result;
        return this;
    }
    
    @JsonProperty("routing_form")
    public String routingForm;
    public RoutingFormSubmission withRoutingForm(String routingForm) {
        this.routingForm = routingForm;
        return this;
    }
    
    @JsonProperty("submitter")
    public String submitter;
    public RoutingFormSubmission withSubmitter(String submitter) {
        this.submitter = submitter;
        return this;
    }
    
    @JsonProperty("submitter_type")
    public RoutingFormSubmissionSubmitterTypeEnum submitterType;
    public RoutingFormSubmission withSubmitterType(RoutingFormSubmissionSubmitterTypeEnum submitterType) {
        this.submitterType = submitterType;
        return this;
    }
    
    @JsonProperty("tracking")
    public SubmissionTracking tracking;
    public RoutingFormSubmission withTracking(SubmissionTracking tracking) {
        this.tracking = tracking;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public RoutingFormSubmission withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonProperty("uri")
    public String uri;
    public RoutingFormSubmission withUri(String uri) {
        this.uri = uri;
        return this;
    }
    
}
