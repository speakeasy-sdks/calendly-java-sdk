package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Question
 * Routing form questions.
**/
public class Question {
    @JsonProperty("answer_choices")
    public String[] answerChoices;
    public Question withAnswerChoices(String[] answerChoices) {
        this.answerChoices = answerChoices;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public Question withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("required")
    public Boolean required;
    public Question withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    
    @JsonProperty("type")
    public QuestionTypeEnum type;
    public Question withType(QuestionTypeEnum type) {
        this.type = type;
        return this;
    }
    
    @JsonProperty("uuid")
    public String uuid;
    public Question withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
}
