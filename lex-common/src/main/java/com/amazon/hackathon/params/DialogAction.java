
package com.amazon.hackathon.params;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "message",
    "intentName",
    "slots",
    "responseCard"
})
public class DialogAction implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("message")
    private Message message;
    @JsonProperty("intentName")
    private String intentName;
    @JsonProperty("slots")
    private Slots slots;
    @JsonProperty("responseCard")
    private ResponseCard responseCard;
    
    private final static long serialVersionUID = 1439847334190596928L;

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("message")
    public Message getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    @JsonProperty("intentName")
    public String getIntentName() {
        return intentName;
    }

    @JsonProperty("intentName")
    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    @JsonProperty("slots")
    public Slots getSlots() {
        return slots;
    }

    @JsonProperty("slots")
    public void setSlots(Slots slots) {
        this.slots = slots;
    }

    @JsonProperty("responseCard")
    public ResponseCard getResponseCard() {
        return responseCard;
    }

    @JsonProperty("responseCard")
    public void setResponseCard(ResponseCard responseCard) {
        this.responseCard = responseCard;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
