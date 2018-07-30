package com.demo.kafka;

import java.io.Serializable;
import java.util.Map;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.kafka.common.serialization.Serializer;

public class SerializableObjectSerializer implements Serializer<Serializable>{

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void configure(Map<String, ?> configs, boolean isKey) {
		// TODO Auto-generated method stub
		
	}

	public byte[] serialize(String topic, Serializable data) {
		return SerializationUtils.serialize(data);
	}

}
