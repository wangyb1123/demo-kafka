package com.demo.kafka;

import org.apache.kafka.clients.consumer.KafkaConsumer;

public interface KafkaConsumerFactory<K,V> {
	
	KafkaConsumer<K,V> createConsumer();

}
