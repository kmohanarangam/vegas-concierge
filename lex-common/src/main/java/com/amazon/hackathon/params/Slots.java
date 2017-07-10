
package com.amazon.hackathon.params;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.amazon.hackathon.serializer.CustomSlotsSerializer;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class Slots implements Serializable
{
	
	@JsonIgnore
    private Map<String, String> other = new HashMap<String, String>();
    private final static long serialVersionUID = 3909307251870916699L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    @JsonSerialize(keyUsing = CustomSlotsSerializer.class)
    public Map<String, String> getOther() {
        return this.other;
    }

    @JsonAnySetter
    public void setOther(String name, String value) {
    	if (other == null ) other = new HashMap<String, String>();
        this.other.put(name, value);
    }

}
