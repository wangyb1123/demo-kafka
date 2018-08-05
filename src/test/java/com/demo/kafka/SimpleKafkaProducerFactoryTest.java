package com.demo.kafka;

import java.util.Properties;

import junit.framework.TestCase;

import org.apache.kafka.clients.producer.KafkaProducer;

public class SimpleKafkaProducerFactoryTest extends TestCase {

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testCreateConsumer(){
		Properties properties = new Properties();
		properties.setProperty("bootstrap.servers", "localhost:9092");
		properties.setProperty("zookeeper.connect", "127.0.0.1:2181");
		properties.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		properties.setProperty("value.deserializer", "org.apache.kafka.common.serialization.ByteArrayDeserializer");
		
		SimpleKafkaProducerFactory<String, String> factory = new SimpleKafkaProducerFactory<String, String>(properties);
		KafkaProducer consumer = factory.createProducer();
	}
}
