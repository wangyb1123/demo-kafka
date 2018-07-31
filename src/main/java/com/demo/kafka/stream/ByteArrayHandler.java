package com.demo.kafka.stream;

public interface ByteArrayHandler {
	
	boolean handle(String name);
	
	void handle(String batchId, byte[] bytes);
}
