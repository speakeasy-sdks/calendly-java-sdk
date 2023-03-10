package calendly.calendly.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
public enum ActivityLogSortEnum {
    ACTION_ASC("action:asc"),
    ACTION_DESC("action:desc"),
    ACTOR_DISPLAY_NAME_ASC("actor.display_name:asc"),
    ACTOR_DISPLAY_NAME_DESC("actor.display_name:desc"),
    ACTOR_URI_ASC("actor.uri:asc"),
    ACTOR_URI_DESC("actor.uri:desc"),
    NAMESPACE_ASC("namespace:asc"),
    NAMESPACE_DESC("namespace:desc"),
    OCCURRED_AT_ASC("occurred_at:asc"),
    OCCURRED_AT_DESC("occurred_at:desc");

    @JsonValue
    public final String value;

    private ActivityLogSortEnum(String value) {
        this.value = value;
    }
}
