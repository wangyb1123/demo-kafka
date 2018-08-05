package com.demo.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;

public interface KafkaProducerFactory<K,V> {
	public KafkaProducer<K,V> createProducer();
}
