package com.amazon.hackathon.serializer;

import java.io.IOException;

import com.amazon.hackathon.params.Slots;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CustomSlotsSerializer extends StdSerializer<Slots>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6316302252063374596L;

	protected CustomSlotsSerializer() {
		super(Slots.class);
	}

	@Override
	public void serialize(Slots arg0, JsonGenerator arg1, SerializerProvider arg2)
			throws IOException, JsonGenerationException {
		arg1.writeFieldName(arg0.getOther().toString());
		
	}

}
