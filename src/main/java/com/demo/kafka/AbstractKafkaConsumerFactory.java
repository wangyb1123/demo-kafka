package com.demo.kafka;

import java.util.Properties;

import org.apache.kafka.clients.consumer.KafkaConsumer;

public abstract class AbstractKafkaConsumerFactory<K,V> implements KafkaConsumerFactory<K, V> {
	
	protected abstract Properties getProperties();
	
	public KafkaConsumer<K,V> createConsumer(){
		return new KafkaConsumer(getProperties());
	}
}
