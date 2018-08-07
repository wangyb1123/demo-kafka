package com.demo.kafka;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultProducerCallback implements Callback {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(DefaultProducerCallback.class);

	@Override
	public void onCompletion(RecordMetadata metaData, Exception exception) {
		if (exception == null) {
			logMetaData(metaData, false);
		} else {
			logMetaData(metaData, true);
		}

	}

	private void logMetaData(RecordMetadata metaData, boolean isError) {
		StringBuilder sb = new StringBuilder();
		if (isError) {
			sb.append("Exception processing ");
		} else {
			sb.append("Sucessfully processed ");
		}
		if (metaData != null) {
			sb.append(new ToStringBuilder(metaData,
					ToStringStyle.SHORT_PREFIX_STYLE)
					.append("topic", metaData.topic())
					.append("partition", metaData.partition())
					.append("offset", metaData.offset()));
		} else {
			sb.append("<No metadata supplied");
		}
		if (isError) {
			LOGGER.error(sb.toString());
		} else {
			LOGGER.debug(sb.toString());
		}
	}

}
