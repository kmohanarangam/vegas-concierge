
package com.amazon.hackathon.params;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dialogAction"
})
public class LexResponse implements Serializable
{

	@JsonProperty("sessionAttributes")
	private SessionAttributes sessionAttributes;
    @JsonProperty("dialogAction")
    private DialogAction dialogAction;

    private final static long serialVersionUID = -286734238521734270L;

    @JsonProperty("dialogAction")
    public DialogAction getDialogAction() {
        return dialogAction;
    }

    @JsonProperty("dialogAction")
    public void setDialogAction(DialogAction dialogAction) {
        this.dialogAction = dialogAction;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
    @JsonProperty("sessionAttributes")
    public SessionAttributes getSessionAttributes() {
        return sessionAttributes;
    }

    @JsonProperty("sessionAttributes")
    public void setSessionAttributes(SessionAttributes sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

}
