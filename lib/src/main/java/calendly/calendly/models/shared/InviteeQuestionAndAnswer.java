package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InviteeQuestionAndAnswer
 * A response to a question on a booking page form
**/
public class InviteeQuestionAndAnswer {
    @JsonProperty("answer")
    public String answer;
    public InviteeQuestionAndAnswer withAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    
    @JsonProperty("position")
    public Double position;
    public InviteeQuestionAndAnswer withPosition(Double position) {
        this.position = position;
        return this;
    }
    
    @JsonProperty("question")
    public String question;
    public InviteeQuestionAndAnswer withQuestion(String question) {
        this.question = question;
        return this;
    }
    
}
