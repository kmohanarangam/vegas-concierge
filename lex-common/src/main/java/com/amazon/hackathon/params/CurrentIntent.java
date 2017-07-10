
package com.amazon.hackathon.params;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "slots",
    "confirmationStatus"
})
public class CurrentIntent {

    @JsonProperty("name")
    private String name;
    @JsonProperty("slots")
    private HashMap<String, String> slots;
    @JsonProperty("confirmationStatus")
    private String confirmationStatus;
    @JsonIgnore
    private Map<String, Object> other = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("slots")
    public HashMap<String, String> getSlots() {
        return slots;
    }

    @JsonProperty("slots")
    public void setSlots(HashMap<String, String> slots) {
        this.slots = slots;
    }

    @JsonProperty("confirmationStatus")
    public String getConfirmationStatus() {
        return confirmationStatus;
    }

    @JsonProperty("confirmationStatus")
    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
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
