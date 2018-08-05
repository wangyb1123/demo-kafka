package com.demo.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;

public abstract class AbstractKafkaProducerFactory<K,V> implements KafkaProducerFactory<K,V>{

	@Override
	public KafkaProducer<K, V> createProducer() {
		// TODO Auto-generated method stub
		return new KafkaProducer<K,V>(getProperties());
	}

	protected abstract Properties getProperties();
}