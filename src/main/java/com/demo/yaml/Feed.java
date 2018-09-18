package com.demo.yaml;

public class Feed {
	
	private String name;
	private Long pollingInterval;
	private Long kafkaTimeout;
	private Integer batchSize;
	
	public Feed(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPollingInterval() {
		return pollingInterval;
	}
	public void setPollingInterval(Long pollingInterval) {
		this.pollingInterval = pollingInterval;
	}
	public Long getKafkaTimeout() {
		return kafkaTimeout;
	}
	public void setKafkaTimeout(Long kafkaTimeout) {
		this.kafkaTimeout = kafkaTimeout;
	}
	public Integer getBatchSize() {
		return batchSize;
	}
	public void setBatchSize(Integer batchSize) {
		this.batchSize = batchSize;
	}
	@Override
	public String toString() {
		return "Feed [name=" + name + ", pollingInterval=" + pollingInterval
				+ ", kafkaTimeout=" + kafkaTimeout + ", batchSize=" + batchSize
				+ "]";
	}
	
}
