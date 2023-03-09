package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubmissionQuestionAndAnswer
 * All Routing Form Submission questions with answers.
**/
public class SubmissionQuestionAndAnswer {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("answer")
    public String answer;
    public SubmissionQuestionAndAnswer withAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    
    @JsonProperty("question")
    public String question;
    public SubmissionQuestionAndAnswer withQuestion(String question) {
        this.question = question;
        return this;
    }
    
    @JsonProperty("question_uuid")
    public String questionUuid;
    public SubmissionQuestionAndAnswer withQuestionUuid(String questionUuid) {
        this.questionUuid = questionUuid;
        return this;
    }
    
}
