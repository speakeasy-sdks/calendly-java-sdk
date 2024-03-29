/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package calendly.calendly.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventTypeCustomQuestion {
    /**
     * The invitee\u2019s option(s) for single_select or multi_select type of responses.
     */
    @JsonProperty("answer_choices")
    public String[] answerChoices;
    public EventTypeCustomQuestion withAnswerChoices(String[] answerChoices) {
        this.answerChoices = answerChoices;
        return this;
    }
    
    /**
     * true if the question created by the host is turned ON and visible on the event booking page; false if turned OFF and invisible on the event booking page.
     */
    @JsonProperty("enabled")
    public Boolean enabled;
    public EventTypeCustomQuestion withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    
    /**
     * true if the custom question lets invitees record a written response in addition to single-select or multiple-select type of responses; false if it doesn\u2019t.
     */
    @JsonProperty("include_other")
    public Boolean includeOther;
    public EventTypeCustomQuestion withIncludeOther(Boolean includeOther) {
        this.includeOther = includeOther;
        return this;
    }
    
    /**
     * The custom question that the host created for the event type.
     */
    @JsonProperty("name")
    public String name;
    public EventTypeCustomQuestion withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * The numerical position of the question on the event booking page after the name and email address fields.
     */
    @JsonProperty("position")
    public Double position;
    public EventTypeCustomQuestion withPosition(Double position) {
        this.position = position;
        return this;
    }
    
    /**
     * true if a response to the question created by the host is required for invitees to book the event type; false if not required.
     */
    @JsonProperty("required")
    public Boolean required;
    public EventTypeCustomQuestion withRequired(Boolean required) {
        this.required = required;
        return this;
    }
    
    /**
     * The type of response that the invitee provides to the custom question; can be one or multiple lines of text, a phone number, or single- or multiple-select.
     */
    @JsonProperty("type")
    public EventTypeCustomQuestionTypeEnum type;
    public EventTypeCustomQuestion withType(EventTypeCustomQuestionTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
