package com.demo.kafka;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

public class DefaultProducerCallback implements Callback {

	@Override
	public void onCompletion(RecordMetadata metaData, Exception exception) {
		if(exception==null){
			logMetaData(metaData, false);
		}else{
			logMetaData(metaData, true);
		}
		
	}

}
