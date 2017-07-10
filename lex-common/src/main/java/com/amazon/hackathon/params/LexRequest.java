
package com.amazon.hackathon.params;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currentIntent",
    "bot",
    "userId",
    "inputTranscript",
    "invocationSource",
    "outputDialogMode",
    "messageVersion",
    "sessionAttributes"
})
public class LexRequest {

    @JsonProperty("currentIntent")
    private CurrentIntent currentIntent;
    @JsonProperty("bot")
    private Bot bot;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("inputTranscript")
    private String inputTranscript;
    @JsonProperty("invocationSource")
    private String invocationSource;
    @JsonProperty("outputDialogMode")
    private String outputDialogMode;
    @JsonProperty("messageVersion")
    private String messageVersion;
    @JsonProperty("sessionAttributes")
    private HashMap<String, String> sessionAttributes;
    
    private Map<String, Object> other = new HashMap<String, Object>();

    @JsonProperty("currentIntent")
    public CurrentIntent getCurrentIntent() {
        return currentIntent;
    }

    @JsonProperty("currentIntent")
    public void setCurrentIntent(CurrentIntent currentIntent) {
        this.currentIntent = currentIntent;
    }

    @JsonProperty("bot")
    public Bot getBot() {
        return bot;
    }

    @JsonProperty("bot")
    public void setBot(Bot bot) {
        this.bot = bot;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("inputTranscript")
    public String getInputTranscript() {
        return inputTranscript;
    }

    @JsonProperty("inputTranscript")
    public void setInputTranscript(String inputTranscript) {
        this.inputTranscript = inputTranscript;
    }

    @JsonProperty("invocationSource")
    public String getInvocationSource() {
        return invocationSource;
    }

    @JsonProperty("invocationSource")
    public void setInvocationSource(String invocationSource) {
        this.invocationSource = invocationSource;
    }

    @JsonProperty("outputDialogMode")
    public String getOutputDialogMode() {
        return outputDialogMode;
    }

    @JsonProperty("outputDialogMode")
    public void setOutputDialogMode(String outputDialogMode) {
        this.outputDialogMode = outputDialogMode;
    }

    @JsonProperty("messageVersion")
    public String getMessageVersion() {
        return messageVersion;
    }

    @JsonProperty("messageVersion")
    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    @JsonProperty("sessionAttributes")
    public HashMap<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    @JsonProperty("sessionAttributes")
    public void setSessionAttributes(HashMap<String, String> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }

    @JsonAnyGetter
    public Map<String, Object> getOther() {
        return this.other;
    }

    @JsonAnySetter
    public void setOther(String name, Object value) {
        this.other.put(name, value);
    }

}
