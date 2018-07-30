package com.demo.kafka;

import java.util.Properties;

public class ConfigurableKafkaConsumerFactory<K,V> extends AbstractKafkaConsumerFactory<K,V> {
	
	private static final String KAFKA_PROPERTIES_PREFIX = "kafka";
	
	private ConfigurationUtils configurationUtils;
	

	@Override
	protected Properties getProperties() {
		String mode = configurationUtils.getProperty(PropertyNames.ENV_PROPERTY);
		Properties properties = configurationUtils.getPropertiesByGroup(KAFKA_PROPERTIES_PREFIX);
		String kafkaClientId = properties.getProperty(PropertyNames.KAFKA_CLIENT_ID);
		String kafkaGroupId = properties.getProperty(PropertyNames.KAFKA_GROUP_ID);
		properties.put(PropertyNames.KAFKA_CLIENT_ID, kafkaClientId + "-" + mode);
		properties.put(PropertyNames.KAFKA_GROUP_ID, kafkaGroupId + "-" + mode);
		return properties;
	}

}
