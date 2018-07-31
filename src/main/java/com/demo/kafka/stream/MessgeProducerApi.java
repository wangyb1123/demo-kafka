package com.demo.kafka.stream;

public interface MessgeProducerApi {
	
	public void send(String identifier, String type, byte[] bytes) throws Exception;
	
	public void send(String identifier, String type, String text) throws Exception;
}
