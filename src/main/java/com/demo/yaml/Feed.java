package com.demo.yaml;

public class Feed {
	
	private String name;
	private String pollingInterval;
	private String kafkaTimeout;
	private String batchSize;
	
	public Feed(){
		
	}
	
//	public Feed(String name, String pollingInterval, String kafkaTimeout,
//			String batchSize) {
//		super();
//		this.name = name;
//		this.pollingInterval = pollingInterval;
//		this.kafkaTimeout = kafkaTimeout;
//		this.batchSize = batchSize;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPollingInterval() {
		return pollingInterval;
	}
	public void setPollingInterval(String pollingInterval) {
		this.pollingInterval = pollingInterval;
	}
	public String getKafkaTimeout() {
		return kafkaTimeout;
	}
	public void setKafkaTimeout(String kafkaTimeout) {
		this.kafkaTimeout = kafkaTimeout;
	}
	public String getBatchSize() {
		return batchSize;
	}
	public void setBatchSize(String batchSize) {
		this.batchSize = batchSize;
	}
	@Override
	public String toString() {
		return "Feed [name=" + name + ", pollingInterval=" + pollingInterval
				+ ", kafkaTimeout=" + kafkaTimeout + ", batchSize=" + batchSize
				+ "]";
	}
	
	
	
}
