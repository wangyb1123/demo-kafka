package com.demo.kafka.stream;

import java.io.Serializable;

public class ByteMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8831024924993139353L;
	
	private byte[] bytes;
	
	public ByteMessage(byte[] bytes){
		this.bytes = bytes;
	}

	public byte[] getBytes() {
		return bytes;
	}
	
	public String convertToString(){
		return new String(getBytes());
	}
}
