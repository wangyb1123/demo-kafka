package com.demo.kafka;

import java.io.Serializable;
import java.util.Map;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.kafka.common.serialization.Deserializer;

public class SerializableObjectDeserializer implements Deserializer<Serializable>{

	public void close() {
		
	}

	public void configure(Map<String, ?> configs, boolean isKey) {
		
	}

	public Serializable deserialize(String topic, byte[] data) {
		return SerializationUtils.deserialize(data);
	}

}
