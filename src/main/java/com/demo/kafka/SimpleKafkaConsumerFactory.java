package com.demo.kafka;

import java.util.Properties;

public class SimpleKafkaConsumerFactory<K,V> extends AbstractKafkaConsumerFactory<K,V>{
	
	private Properties properties;
	
	public SimpleKafkaConsumerFactory(Properties props){
		this.properties = properties;
	}

	@Override
	protected Properties getProperties() {
		return this.properties;
	}

}
