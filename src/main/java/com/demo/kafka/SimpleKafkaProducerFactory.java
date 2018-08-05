package com.demo.kafka;

import java.util.Properties;

public class SimpleKafkaProducerFactory<K,V> extends AbstractKafkaProducerFactory<K,V>{
	
	private Properties properties;
	
	public SimpleKafkaProducerFactory(Properties props){
		this.properties = props;
	}

	@Override
	protected Properties getProperties() {
		return this.properties;
	}

}
