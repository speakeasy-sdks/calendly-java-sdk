package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventTypeCustomQuestion {
    @JsonProperty("answer_choices")
    public String[] answerChoices;
    public EventTypeCustomQuestion withAnswerChoices(String[] answerChoices) {
        this.answerChoices = answerChoices;
        return this;
    }
    
    @JsonProperty("enabled")
    public Boolean enabled;
    public EventTypeCustomQuestion withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    
    @JsonProperty("include_other")
    public Boolean includeOther;
    public EventTypeCustomQuestion withIncludeOther(Boolean includeOther) {
        this.includeOther = includeOther;
        return this;
    }
    
    @JsonProperty("name")
    public String name;
    public EventTypeCustomQuestion withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("position")
    public Double position;
    public EventTypeCustomQuestion withPosition(Double position) {
        this.position = position;
        return this;
    }
    
    @JsonProperty("required")
    public Boolean required;
    public EventTypeCustomQuestion withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    
    @JsonProperty("type")
    public EventTypeCustomQuestionTypeEnum type;
    public EventTypeCustomQuestion withType(EventTypeCustomQuestionTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
