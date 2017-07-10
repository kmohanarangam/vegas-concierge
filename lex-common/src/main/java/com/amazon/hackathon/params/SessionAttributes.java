
package com.amazon.hackathon.params;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionAttributes {

    @JsonIgnore
    private Map<String, Object> other = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getOther() {
        return this.other;
    }

    @JsonAnySetter
    public void setOther(String name, Object value) {
        this.other.put(name, value);
    }

}
